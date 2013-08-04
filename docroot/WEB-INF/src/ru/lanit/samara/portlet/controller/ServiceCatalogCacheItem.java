package ru.lanit.samara.portlet.controller;

import com.liferay.portal.kernel.webcache.WebCacheException;
import com.liferay.portal.kernel.webcache.WebCacheItem;

/**
 * Created by Galimov Ruslan
 */
public class ServiceCatalogCacheItem implements WebCacheItem {

    public ServiceCatalogCacheItem() {
    }

    @Override
    public Object convert(String s) throws WebCacheException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public long getRefreshTime() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
