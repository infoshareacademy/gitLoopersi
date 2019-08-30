package repository;

import domain.Holiday;
import java.util.ArrayList;
import java.util.List;

public class HolidayRepository {

  private static List<Holiday> allHolidays = new ArrayList<>();
  private static final String HOLIDAY_JSON = "HolidayApi.json";

  private HolidayRepository() {
  }

  public static List<Holiday> getAllHolidays() {
    return allHolidays;
  }

  public static void setAllHolidays(List<Holiday> allHolidays) {
    HolidayRepository.allHolidays = allHolidays;
  }

  public static String getHolidayJson() {
    return HOLIDAY_JSON;
  }
}
