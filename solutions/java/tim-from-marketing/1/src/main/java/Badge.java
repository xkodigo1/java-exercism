class Badge {
    public String print(Integer id, String name, String department) {
        String departmentString = (department == null) ? "OWNER" : department.toUpperCase();

        if (id == null) {
            return name + " - " + departmentString;
        } else if (department == null) {
            return "[" + id + "] - " + name + " - OWNER";
        } else {
            return "[" + id + "] - " + name + " - " + departmentString;
        }
    }
}
