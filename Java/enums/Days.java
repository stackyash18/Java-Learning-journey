package enums;

public enum Days {
  MONDAY(true), TUESDAY(true), WEDNESDAY(true), THURSDAY(true), FRIDAY(true), SATURDAY(true), SUNDAY(false);

  private final boolean isWeekDay;

  Days(boolean isWeekDay)
  {
    this.isWeekDay = isWeekDay;
  }

  public String getType()
  {
    return isWeekDay ? "Weekday" : "Weekend"; 
  }
}

