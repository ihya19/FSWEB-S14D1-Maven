package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[5];
        this.midDevelopers = new MidDeveloper[5];
        this.seniorDevelopers = new SeniorDeveloper[5];
    }


    @Override
    public void work() {
        System.out.println("HR Manager is managing developers...");
        setSalary(getSalary() + 1500);
    }

    public void addEmployee(JuniorDeveloper developer) {
        boolean added = false;
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = developer;
                added = true;
                break;
            }
        }
        if (!added) {
            System.out.println("No space to add a Junior Developer!");
        }
    }

    public void addEmployee(MidDeveloper developer) {
        boolean added = false;
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = developer;
                added = true;
                break;
            }
        }
        if (!added) {
            System.out.println("No space to add a Mid Developer!");
        }
    }

    public void addEmployee(SeniorDeveloper developer) {
        boolean added = false;
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = developer;
                added = true;
                break;
            }
        }
        if (!added) {
            System.out.println("No space to add a Senior Developer!");
        }
    }


    public void listAllEmployees() {
        System.out.println("---- Junior Developers ----");
        for (JuniorDeveloper jd : juniorDevelopers) {
            if (jd != null) System.out.println(jd.getName());
        }

        System.out.println("---- Mid Developers ----");
        for (MidDeveloper md : midDevelopers) {
            if (md != null) System.out.println(md.getName());
        }

        System.out.println("---- Senior Developers ----");
        for (SeniorDeveloper sd : seniorDevelopers) {
            if (sd != null) System.out.println(sd.getName());
        }
    }
}
