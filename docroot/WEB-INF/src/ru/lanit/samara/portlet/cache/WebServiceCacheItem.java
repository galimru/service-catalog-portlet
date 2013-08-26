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

    private long refreshTime;

    public WebServiceCacheItem(long refreshTime) {
        this.refreshTime = refreshTime;
    }

    public WebServiceCacheItem() {
        this(DEFAULT_REFRESH_TIME);
    }

    @Override
    public Object convert(String s) throws WebCacheException {
        return AxisUtil.fetch();
    }

    @Override
    public long getRefreshTime() {
        return refreshTime;
    }
}
