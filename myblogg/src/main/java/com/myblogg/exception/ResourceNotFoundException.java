package com.myblogg.exception;

public class ResourceNotFoundException extends RuntimeException {
    //resourceName it means Entity className ,fieldName is id and value 1000(and this vl display the mesg postnot foundwith id 1000 otherwise it vl crash)
    private String resourceName;
    private String fieldName;
    private String fieldValue;
    //whenever exception happens i vl callthis constructor and to this const i vl give resourceNme,fieldName,fieldValue and using that i vl intialize above varibles
    public String ResourceNotFoundException(String resourceName, String fieldName, String fieldvalue)
    {
        super(String.format("%s not found with %s : '%s'",resourceName,fieldName,fieldvalue));
       this.resourceName=resourceName;
       this.fieldName=fieldName;
       this.fieldValue=fieldvalue;
        public String getResourceName() {
        return resourceName;
    }

        public String getFieldName() {
        return fieldName;
    }

        public String getFieldValue() {
        return fieldValue;
    }




    }
}
