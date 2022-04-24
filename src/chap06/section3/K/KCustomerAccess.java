package chap06.section3.K;

public class KCustomerAccess {
    public static void main(String[] args){
        System.out.println(KCustomer.LEVEL);
        KCustomer.login();
        KCustomer.Companion.login();

        KJob kJob = KCustomer.JOB;
        System.out.println(kJob.getTitle());

        KCustomer.JOB.setTitle("Accountant");
        System.out.println(KCustomer.JOB.getTitle());
    }
}
