public interface IWorkables {
    String WorkType();
}

class Dull implements IWorkables{
    public String WorkType() {
        return null;
    }
}
class Programmer implements IWorkables{
    public String WorkType() {
        return "Programmer";
    }
}

class SystemAnalyst implements IWorkables{
    public String WorkType() {
        return "System Analyst";
    }
}
class Utility implements IWorkables{
    public String WorkType() {
        return "Utility";
    }
}
