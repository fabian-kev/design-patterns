package com.fabiankevin.designpatterns.structrural.proxy;

import java.util.HashMap;
import java.util.Map;

public class Browser {
    Map<String, Page> pageMap = new HashMap<>();
    public void openPage(String url) {
        Page page = pageMap.get(url);
        if(page == null){
            page = new PageImpl(url);
            pageMap.put(url, page);
        }
        page.display();;
    }
}