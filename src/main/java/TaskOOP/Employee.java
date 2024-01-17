package TaskOOP;

abstract class Employee {
    Employee(String name) {
        this.name = name;
    }

    String name;

    abstract void Work();

}

class Manager extends Employee {
    Manager(String name) {
        super(name);
    }

    @Override
    void Work() {
        System.out.println("Управляет проектами");
    }
}

class WarehouseWorker extends Employee {
    WarehouseWorker(String name) {
        super(name);
    }

    @Override
    void Work() {
        System.out.println("Заполняет накладную, и ведет учет");
    }
}
