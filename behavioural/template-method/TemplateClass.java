abstract class TemplateClass {

    private void step1() {
        System.out.println("Executing step 1");
    }

    private void step2() {
        System.out.println("Executing step 2");
    }

    // this method should be implemented inside the derived class
    abstract void step3();

    private void step4() {
        System.out.println("Executing step 4");
    }

    // Skeleton of the algorithm
    void algorithm() {
        step1();
        step2();
        step3();
        step4();
    }
}