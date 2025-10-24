package lesson5;

public enum YearsOfMonth {
    JANUARY(1,31),
    FEBRUARY(2,28),
    MARCH(3,30),
    APRIL(4,31),
    MAY(5,30),
    JUNE(6,31);

    private final int indexOfYear ;
    private final int daysInMonth ;

    YearsOfMonth(int indexOfYear, int daysInMonth) {
        this.daysInMonth = daysInMonth;
        this.indexOfYear = indexOfYear;
    }


    public int getIndexOfYear() {
        return indexOfYear;
    }
    public int getIndexOfMonth() {
        return daysInMonth;
    }







}



