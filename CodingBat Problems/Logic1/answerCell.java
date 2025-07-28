public class answerCell {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) return false;
        if (isMorning && !isMom) return false;
        return true;
    }

    public static void main(String[] args) {
        answerCell obj = new answerCell();
        System.out.println(obj.answerCell(false, false, false));
        System.out.println(obj.answerCell(false, false, true));
        System.out.println(obj.answerCell(true, false, false));
        System.out.println(obj.answerCell(true, true, false));
    }
}
