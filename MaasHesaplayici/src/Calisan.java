public class Calisan {
    String fullName;
    int salary, workHours,hireYear;
    double tax,raiseSalary=0.0;
    int thisYear=2021,bonus;


    Calisan(String fullName, int salary, int workHours, int hireYear){
        this.fullName=fullName;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }
    void tax(){
        if (this.salary<=1000){
            this.tax=0;
        }else if (this.salary>1000){
            this.tax = salary*0.03;
        }

    }
    void bonus(){
        if (this.workHours>40){
            this.bonus = (this.workHours-40)*30;
        }else {
            this.bonus=0;
        }
    }
    void raiseSalary(){

        if (thisYear- this.hireYear <10){
            this.raiseSalary = salary*0.05;
        }
        if (thisYear- this.hireYear >9 && thisYear- this.hireYear <20){
            this.raiseSalary = salary*0.1;
        }
        if (thisYear- this.hireYear >19){
            this.raiseSalary = salary*0.15;
        }

    }
    void Yazdir(){
        System.out.println("Adı ve Soyadi : "+ this.fullName);
        System.out.println("Maasi : "+ this.salary);
        System.out.println("Calisma Saati : "+ this.workHours);
        System.out.println("Ise baslangic yili : " +this.hireYear);
        System.out.println("Vergi : "+this.tax);
        System.out.println("Bonus: "+this.bonus);
        System.out.println("Maas artisi: "+ this.raiseSalary);
        System.out.println("Toplam Maas: "+ (this.salary+this.raiseSalary+this.bonus-this.tax));
    }

}
