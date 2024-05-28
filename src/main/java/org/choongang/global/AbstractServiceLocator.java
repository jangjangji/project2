package org.choongang.global;

import org.choongang.global.constants.Menu;
import org.choongang.member.services.MemberServiceLocator;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractServiceLocator implements ServiceLocator {
    public static ServiceLocator getInstance(){
        if (instance == null){
            instance = new MemberServiceLocator();
        }
        return instance;
    }
    protected static ServiceLocator instance;

    protected Map<Menu, Service> services;

    protected AbstractServiceLocator() {
        services = new HashMap<>();
    }
}

