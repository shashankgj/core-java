class CompanyRunner {
    public static void main(String[] args) {
        String[] employeeNames = Company.getEmployeeNames();
        for (int i = 0; i < employeeNames.length; i++) {
            System.out.println(employeeNames[i]);
        }

        int[] employeeIds = Company.getEmployeeIds();
        for (int i = 0; i < employeeIds.length; i++) {
            System.out.println(employeeIds[i]);
        }

        float[] scores = Company.getAppraisalScores();
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        double[] salaries = Company.getSalaries();
        for (int i = 0; i < salaries.length; i++) {
            System.out.println(salaries[i]);
        }

        char[] grades = Company.getGrades();
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }

        boolean[] status = Company.getIsPermanent();
        for (int i = 0; i < status.length; i++) {
            System.out.println(status[i]);
        }

        long[] contacts = Company.getContactNumbers();
        for (int i = 0; i < contacts.length; i++) {
            System.out.println(contacts[i]);
        }

        short[] deptCodes = Company.getDepartmentCodes();
        for (int i = 0; i < deptCodes.length; i++) {
            System.out.println(deptCodes[i]);
        }

        byte[] shifts = Company.getShiftCodes();
        for (int i = 0; i < shifts.length; i++) {
            System.out.println(shifts[i]);
        }
    }
}
