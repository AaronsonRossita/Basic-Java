package com.company;

public class Food {

    private String type;
    private String company;

    public Food(String type, String company) {
        this.type = type;
        this.company = company;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    protected void spoil(){
        System.out.println(" is spoiled");
    }

    public  int compareTo (Food f){
        if(f.type != this.type || f.company != this.company){
            return -1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "This food is of " + type + " type\n"
                + "and it is produced by " + company;
    }

    @Override
    public boolean equals(Object obj) {
        Food f = (Food) obj;
        if(f.company == this.company && f.type == this.type){
            return true;
        }else{
            return false;
        }
    }


}
