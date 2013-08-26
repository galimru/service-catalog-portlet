package ru.lanit.samara.portlet.cache;

import com.liferay.portal.kernel.webcache.WebCacheException;
import com.liferay.portal.kernel.webcache.WebCacheItem;
import ru.lanit.samara.portlet.utils.AxisUtil;

/**
 * Created by Galimov Ruslan
 */
public class WebServiceCacheItem implements WebCacheItem {

    private static final long serialVersionUID = -4852509803968739089L;

    public static final String CACHE_KEY = "CATALOG_SERVICE";
    private static final long DEFAULT_REFRESH_TIME = 60000;

    private String wsUrl;
    private long refreshTime;

    public WebServiceCacheItem(String wsUrl) {
        this(wsUrl, DEFAULT_REFRESH_TIME);
    }

    public WebServiceCacheItem(String wsUrl, long refreshTime) {
        this.wsUrl = wsUrl;
        this.refreshTime = refreshTime;
    }

    @Override
    public Object convert(String s) throws WebCacheException {
        return AxisUtil.fetch(wsUrl);
    }

    @Override
    public long getRefreshTime() {
        return refreshTime;
    }
}
