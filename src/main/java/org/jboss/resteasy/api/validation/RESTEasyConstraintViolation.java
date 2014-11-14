package org.jboss.resteasy.api.validation;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * 
 * @author Alessandro
 */
public class RESTEasyConstraintViolation implements Serializable
{
   private String message;
   private String path;
   private String value;
   private ConstraintType.Type constraintType;
   
   /**
    * @return type of constraint
    */
   public ConstraintType.Type getConstraintType()
   {
      return constraintType;
   }
   
   /**
    * @return description of element violating constraint
    */
   public String getPath()
   {
      return path;
   }
   
   /**
    * @return description of constraint violation
    */
   public String getMessage()
   {
      return message;
   }
   
   /**
    * @return object in violation of constraint
    */
   public String getValue()
   {
      return value;
   }
   
   /**
    * @return String representation of violation
    */
   public String toString()
   {
      return type() + "| " + path + "| " + message + "| " + value;
   }
   
   /**
    * @return String form of violation type 
    */
   public String type()
   {
      return constraintType.toString();
   }
}
