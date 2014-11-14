package org.jboss.resteasy.api.validation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alessandro
 */
public class ConstraintType
{
 
    /**
     *
     */
    public enum Type { 

        /**
         *
         */
        CLASS, 

       /**
        *
        */
       FIELD, 

        /**
         *
         */
        PROPERTY, 

        /**
         *
         */
        PARAMETER, 

       /**
        *
        */
       RETURN_VALUE};
}
