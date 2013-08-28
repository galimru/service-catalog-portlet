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
    private String owner;
    private long refreshTime;

    public WebServiceCacheItem(String wsUrl) {
        this(wsUrl, null);
    }

    public WebServiceCacheItem(String wsUrl, String owner) {
        this(wsUrl, owner, DEFAULT_REFRESH_TIME);
    }

    public WebServiceCacheItem(String wsUrl, String owner, long refreshTime) {
        this.wsUrl = wsUrl;
        this.owner = owner;
        this.refreshTime = refreshTime;
    }

    @Override
    public Object convert(String s) throws WebCacheException {
        return AxisUtil.getServices(wsUrl, owner);
    }

    @Override
    public long getRefreshTime() {
        return refreshTime;
    }
}
