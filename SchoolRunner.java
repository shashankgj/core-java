class SchoolRunner {
    public static void main(String[] args) {
        String[] teacherNames = School.getTeacherNames();
        for (int i = 0; i < teacherNames.length; i++) {
            System.out.println(teacherNames[i]);
        }

        int[] studentCounts = School.getStudentCounts();
        for (int i = 0; i < studentCounts.length; i++) {
            System.out.println(studentCounts[i]);
        }

        float[] avgGrades = School.getAvgGrades();
        for (int i = 0; i < avgGrades.length; i++) {
            System.out.println(avgGrades[i]);
        }

        double[] fees = School.getFees();
        for (int i = 0; i < fees.length; i++) {
            System.out.println(fees[i]);
        }

        char[] sections = School.getSections();
        for (int i = 0; i < sections.length; i++) {
            System.out.println(sections[i]);
        }

        boolean[] isSectionActive = School.getIsSectionActive();
        for (int i = 0; i < isSectionActive.length; i++) {
            System.out.println(isSectionActive[i]);
        }

        long[] staffIds = School.getStaffIds();
        for (int i = 0; i < staffIds.length; i++) {
            System.out.println(staffIds[i]);
        }

        short[] labRoomNumbers = School.getLabRoomNumbers();
        for (int i = 0; i < labRoomNumbers.length; i++) {
            System.out.println(labRoomNumbers[i]);
        }

        byte[] morningBatches = School.getMorningBatches();
        for (int i = 0; i < morningBatches.length; i++) {
            System.out.println(morningBatches[i]);
        }
    }
}
