package com.verizon.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="StoreInfo") 

public class StoreInfo
{
	
    private Stores[] store;

    public Stores[] getStore()
    {
        return store;
    }

    public void setStore (Stores[] store)
    {
        this.store = store;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [store = "+store+"]";
    }
}