package Oops_constructor;

public class Lab02
{
    String model;
    int year;

    Lab02(){
        model= "XXX";
        year  = 1900;
        System.out.println("DC");
    }

    Lab02(String model_name,int year_created){
        this.model = model_name;
        this.year = year_created;
    }

    Lab02(String model_name){
        this.model = model_name;
    }


}
