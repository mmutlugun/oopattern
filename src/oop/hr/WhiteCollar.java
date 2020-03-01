package oop.hr;

public class WhiteCollar extends Employee {

    private int salary;
    private String address;

    public WhiteCollar(String name, int salary){
        super(name, "Kaiser");
        this.salary = salary;
    }

    public WhiteCollar(WhiteCollarBuilder builder){
        super(builder.name, "Kaiser");
        this.salary = builder.salary;
        this.address = builder.address;
    }

    @Override
    public int getWage(){
        return salary;
    }

    public int getSalary() {
        return salary;
    }

    public static class WhiteCollarBuilder {
        private String name;
        private int salary;
        private String address;

        public WhiteCollarBuilder(String name, int salary){
            this.name  = name;
            this.salary = salary;
        }

        public WhiteCollarBuilder(){
            this.name  = name;
            this.salary = salary;
        }

        public WhiteCollarBuilder name(String name){
            this.name = name;
            return this;
        }

        public WhiteCollarBuilder salary(int salary){
            this.salary = salary;
            return this;
        }

        public WhiteCollarBuilder address(String address){
            this.address = address;
            return this;
        }


        public WhiteCollar build(){
            WhiteCollar wc = new WhiteCollar(this);
            validateWhiteCollarObject(wc);
            return wc;
        }

        private void validateWhiteCollarObject(WhiteCollar wc) {
            if (wc.getSalary() <= 0 || name == null || address ==null) {
                throw new IllegalArgumentException("Salary can't be less than or equal to zero");
            }
        }
    }
}
