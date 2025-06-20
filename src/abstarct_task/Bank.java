package abstarct_task;

abstract public class Bank
{
    abstract void getInterestRate();

    static class SBI extends Bank
    {
        @Override
        void getInterestRate()
        {
            System.out.println("SBI Interest Rate: 6.5%");
        }
    }
    static class HDFC extends Bank
    {
        @Override
        void getInterestRate()
        {
            System.out.println("HDFC Interest Rate: 7.0%");
        }
    }
        public static void main(String[] args) {
            SBI sbi=new SBI();
            sbi.getInterestRate();
            HDFC hdfc=new HDFC();
            hdfc.getInterestRate();
        }
    }

