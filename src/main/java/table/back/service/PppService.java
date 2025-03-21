package table.back.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import table.back.entity.Ppp;
import table.back.repository.PppRepository;

import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Duration;


@Service
public class PppService {

    @Autowired
    private PppRepository pppRepository;

    public List<Ppp> getAllPpp() {
        List<Ppp> pppList = pppRepository.findAll();

        for (Ppp ppp : pppList) {

            if (ppp.getPlanPpp() != null) {
                    ppp.setPlanPpp(ppp.getPlanPpp() * 8); // Умножаем на 24
                }
              

          
          
          
    if (ppp.getStartTimePpp1() != null && ppp.getStopTimePpp1() != null) {
    LocalDateTime startTime = ppp.getStartTimePpp1();
    LocalDateTime stopTime = ppp.getStopTimePpp1();

    long totalHours = 0;

    // 1. Определяем границы рабочих дней
    LocalDate startDate = startTime.toLocalDate();
    LocalDate endDate = stopTime.toLocalDate();

    // 2. Проходим по каждому дню в диапазоне
    for (LocalDate date = startDate; !date.isAfter(endDate); date = date.plusDays(1)) {
        LocalDateTime startOfDay = date.atStartOfDay();
        LocalDateTime endOfDay = date.atTime(LocalTime.MAX);

        // 3. Определяем фактическое начало и конец работы в текущий день
        LocalDateTime actualStart = (date.equals(startDate)) ? startTime : startOfDay;
        LocalDateTime actualEnd = (date.equals(endDate)) ? stopTime : endOfDay;

        // 4. Вычисляем длительность работы в этот день
        if (actualStart.isBefore(actualEnd)) { // проверка, чтобы не было отрицательного Duration
            Duration duration = Duration.between(actualStart, actualEnd);
            long hoursInDay = Math.min(duration.toHours(), 8); // Ограничиваем 8 часами
            totalHours += hoursInDay;
        }
    }

    ppp.setOperationTime1(totalHours);
} else {
    ppp.setOperationTime1(null);
}

if (ppp.getStartTimePpp2() != null && ppp.getStopTimePpp2() != null) {
    LocalDateTime startTime = ppp.getStartTimePpp2();
    LocalDateTime stopTime = ppp.getStopTimePpp2();

    long totalHours = 0;

    // 2. Определяем границы рабочих дней
    LocalDate startDate = startTime.toLocalDate();
    LocalDate endDate = stopTime.toLocalDate();

    // 2. Проходим по каждому дню в диапазоне
    for (LocalDate date = startDate; !date.isAfter(endDate); date = date.plusDays(1)) {
        LocalDateTime startOfDay = date.atStartOfDay();
        LocalDateTime endOfDay = date.atTime(LocalTime.MAX);

        // 3. Определяем фактическое начало и конец работы в текущий день
        LocalDateTime actualStart = (date.equals(startDate)) ? startTime : startOfDay;
        LocalDateTime actualEnd = (date.equals(endDate)) ? stopTime : endOfDay;

        // 4. Вычисляем длительность работы в этот день
        if (actualStart.isBefore(actualEnd)) { // проверка, чтобы не было отрицательного Duration
            Duration duration = Duration.between(actualStart, actualEnd);
            long hoursInDay = Math.min(duration.toHours(), 8); // Ограничиваем 8 часами
            totalHours += hoursInDay;
        }
    }

    ppp.setOperationTime2(totalHours);
} else {
    ppp.setOperationTime2(null);
}
if (ppp.getStartTimePpp3() != null && ppp.getStopTimePpp3() != null) {
    LocalDateTime startTime = ppp.getStartTimePpp3();
    LocalDateTime stopTime = ppp.getStopTimePpp3();

    long totalHours = 0;

    // 3. Определяем границы рабочих дней
    LocalDate startDate = startTime.toLocalDate();
    LocalDate endDate = stopTime.toLocalDate();

    // 3. Проходим по каждому дню в диапазоне
    for (LocalDate date = startDate; !date.isAfter(endDate); date = date.plusDays(1)) {
        LocalDateTime startOfDay = date.atStartOfDay();
        LocalDateTime endOfDay = date.atTime(LocalTime.MAX);

        // 3. Определяем фактическое начало и конец работы в текущий день
        LocalDateTime actualStart = (date.equals(startDate)) ? startTime : startOfDay;
        LocalDateTime actualEnd = (date.equals(endDate)) ? stopTime : endOfDay;

        // 4. Вычисляем длительность работы в этот день
        if (actualStart.isBefore(actualEnd)) { // проверка, чтобы не было отрицательного Duration
            Duration duration = Duration.between(actualStart, actualEnd);
            long hoursInDay = Math.min(duration.toHours(), 8); // Ограничиваем 8 часами
            totalHours += hoursInDay;
        }
    }

    ppp.setOperationTime3(totalHours);
} else {
    ppp.setOperationTime3(null);
}

if (ppp.getStartTimePpp4() != null && ppp.getStopTimePpp4() != null) {
    LocalDateTime startTime = ppp.getStartTimePpp4();
    LocalDateTime stopTime = ppp.getStopTimePpp4();

    long totalHours = 0;

    // 4. Определяем границы рабочих дней
    LocalDate startDate = startTime.toLocalDate();
    LocalDate endDate = stopTime.toLocalDate();

    // 4. Проходим по каждому дню в диапазоне
    for (LocalDate date = startDate; !date.isAfter(endDate); date = date.plusDays(1)) {
        LocalDateTime startOfDay = date.atStartOfDay();
        LocalDateTime endOfDay = date.atTime(LocalTime.MAX);

        // 3. Определяем фактическое начало и конец работы в текущий день
        LocalDateTime actualStart = (date.equals(startDate)) ? startTime : startOfDay;
        LocalDateTime actualEnd = (date.equals(endDate)) ? stopTime : endOfDay;

        // 4. Вычисляем длительность работы в этот день
        if (actualStart.isBefore(actualEnd)) { // проверка, чтобы не было отрицательного Duration
            Duration duration = Duration.between(actualStart, actualEnd);
            long hoursInDay = Math.min(duration.toHours(), 8); // Ограничиваем 8 часами
            totalHours += hoursInDay;
        }
    }

    ppp.setOperationTime4(totalHours);
} else {
    ppp.setOperationTime4(null);
}

           
if (ppp.getStartTimePpp5() != null && ppp.getStopTimePpp5() != null) {
    LocalDateTime startTime = ppp.getStartTimePpp5();
    LocalDateTime stopTime = ppp.getStopTimePpp5();

    long totalHours = 0;

    // 5. Определяем границы рабочих дней
    LocalDate startDate = startTime.toLocalDate();
    LocalDate endDate = stopTime.toLocalDate();

    // 5. Проходим по каждому дню в диапазоне
    for (LocalDate date = startDate; !date.isAfter(endDate); date = date.plusDays(1)) {
        LocalDateTime startOfDay = date.atStartOfDay();
        LocalDateTime endOfDay = date.atTime(LocalTime.MAX);

        // 3. Определяем фактическое начало и конец работы в текущий день
        LocalDateTime actualStart = (date.equals(startDate)) ? startTime : startOfDay;
        LocalDateTime actualEnd = (date.equals(endDate)) ? stopTime : endOfDay;

        // 4. Вычисляем длительность работы в этот день
        if (actualStart.isBefore(actualEnd)) { // проверка, чтобы не было отрицательного Duration
            Duration duration = Duration.between(actualStart, actualEnd);
            long hoursInDay = Math.min(duration.toHours(), 8); // Ограничиваем 8 часами
            totalHours += hoursInDay;
        }
    }

    ppp.setOperationTime5(totalHours);
} else {
    ppp.setOperationTime5(null);
}
    
    if (ppp.getStartTimePpp6() != null && ppp.getStopTimePpp6() != null) {
        LocalDateTime startTime = ppp.getStartTimePpp6();
        LocalDateTime stopTime = ppp.getStopTimePpp6();
    
        long totalHours = 0;
    
        // 6. Определяем границы рабочих дней
        LocalDate startDate = startTime.toLocalDate();
        LocalDate endDate = stopTime.toLocalDate();
    
        // 6. Проходим по каждому дню в диапазоне
        for (LocalDate date = startDate; !date.isAfter(endDate); date = date.plusDays(1)) {
            LocalDateTime startOfDay = date.atStartOfDay();
            LocalDateTime endOfDay = date.atTime(LocalTime.MAX);
    
            // 3. Определяем фактическое начало и конец работы в текущий день
            LocalDateTime actualStart = (date.equals(startDate)) ? startTime : startOfDay;
            LocalDateTime actualEnd = (date.equals(endDate)) ? stopTime : endOfDay;
    
            // 4. Вычисляем длительность работы в этот день
            if (actualStart.isBefore(actualEnd)) { // проверка, чтобы не было отрицательного Duration
                Duration duration = Duration.between(actualStart, actualEnd);
                long hoursInDay = Math.min(duration.toHours(), 8); // Ограничиваем 8 часами
                totalHours += hoursInDay;
            }
        }
    
        ppp.setOperationTime6(totalHours);
    } else {
        ppp.setOperationTime6(null);

    }
        if (ppp.getStartTimePpp7() != null && ppp.getStopTimePpp7() != null) {
            LocalDateTime startTime = ppp.getStartTimePpp7();
            LocalDateTime stopTime = ppp.getStopTimePpp7();
        
            long totalHours = 0;
        
            // 7. Определяем границы рабочих дней
            LocalDate startDate = startTime.toLocalDate();
            LocalDate endDate = stopTime.toLocalDate();
        
            // 7. Проходим по каждому дню в диапазоне
            for (LocalDate date = startDate; !date.isAfter(endDate); date = date.plusDays(1)) {
                LocalDateTime startOfDay = date.atStartOfDay();
                LocalDateTime endOfDay = date.atTime(LocalTime.MAX);
        
                // 3. Определяем фактическое начало и конец работы в текущий день
                LocalDateTime actualStart = (date.equals(startDate)) ? startTime : startOfDay;
                LocalDateTime actualEnd = (date.equals(endDate)) ? stopTime : endOfDay;
        
                // 4. Вычисляем длительность работы в этот день
                if (actualStart.isBefore(actualEnd)) { // проверка, чтобы не было отрицательного Duration
                    Duration duration = Duration.between(actualStart, actualEnd);
                    long hoursInDay = Math.min(duration.toHours(), 8); // Ограничиваем 8 часами
                    totalHours += hoursInDay;
                }
            }
        
            ppp.setOperationTime7(totalHours);
        } else {
            ppp.setOperationTime7(null);
        }




            if (ppp.getPlanDataStart1C() != null && ppp.getOperationNorm1() != null && ppp.getOptionNorm1() != null) {
                LocalDate baseDate = ppp.getPlanDataStart1C();
                long daysToAdd = ppp.getOperationNorm1() / 8;
                daysToAdd += ppp.getOptionNorm1() / 8;
                LocalDate calculatedDate = baseDate.plusDays(daysToAdd);
                ppp.setPlanDataStart1(calculatedDate);
            } else {
                ppp.setPlanDataStart1(null);
            }

            // Вычисляем planDataStart2
            if (ppp.getPlanDataStart1() != null && ppp.getOperationNorm1() != null && ppp.getOptionNorm1() != null) {
                LocalDate baseDate = ppp.getPlanDataStart1();
                long daysToAdd = ppp.getOperationNorm1() / 8;
                daysToAdd += ppp.getOptionNorm1() / 8;
                LocalDate calculatedDate = baseDate.plusDays(daysToAdd);
                ppp.setPlanDataStart2(calculatedDate);
            } else {
                ppp.setPlanDataStart2(null);
            }
            // Вычисляем planDataStart3
            if (ppp.getPlanDataStart2() != null && ppp.getOperationNorm2() != null && ppp.getOptionNorm2() != null) {
                LocalDate baseDate = ppp.getPlanDataStart2();
                long daysToAdd = ppp.getOperationNorm2() / 8;
                daysToAdd += ppp.getOptionNorm2() / 8;
                LocalDate calculatedDate = baseDate.plusDays(daysToAdd);
                ppp.setPlanDataStart3(calculatedDate);
            } else {
                ppp.setPlanDataStart3(null);
            }
            // Вычисляем planDataStart4
            if (ppp.getPlanDataStart3() != null && ppp.getOperationNorm3() != null && ppp.getOptionNorm3() != null) {
                LocalDate baseDate = ppp.getPlanDataStart3();
                long daysToAdd = ppp.getOperationNorm3() / 8;
                daysToAdd += ppp.getOptionNorm3() / 8;
                LocalDate calculatedDate = baseDate.plusDays(daysToAdd);
                ppp.setPlanDataStart4(calculatedDate);
            } else {
                ppp.setPlanDataStart4(null);
            }
            // Вычисляем planDataStart5
            if (ppp.getPlanDataStart4() != null && ppp.getOperationNorm4() != null && ppp.getOptionNorm4() != null)  {
                LocalDate baseDate = ppp.getPlanDataStart4();
                long daysToAdd = ppp.getOperationNorm4() / 8;
                daysToAdd += ppp.getOptionNorm4() / 8;
                LocalDate calculatedDate = baseDate.plusDays(daysToAdd);
                ppp.setPlanDataStart5(calculatedDate);
            } else {
                ppp.setPlanDataStart5(null);
            }
            // Вычисляем planDataStart6
            if (ppp.getPlanDataStart5() != null && ppp.getOperationNorm5() != null && ppp.getOptionNorm5() != null) {
                LocalDate baseDate = ppp.getPlanDataStart5();
                long daysToAdd = ppp.getOperationNorm5() / 8;
                daysToAdd += ppp.getOptionNorm5() / 8;
                LocalDate calculatedDate = baseDate.plusDays(daysToAdd);
                ppp.setPlanDataStart6(calculatedDate);
            } else {
                ppp.setPlanDataStart6(null);
            }
            // Вычисляем planDataStart7
            if (ppp.getPlanDataStart6() != null && ppp.getOperationNorm6() != null  && ppp.getOptionNorm6() != null) {
                LocalDate baseDate = ppp.getPlanDataStart6();
                long daysToAdd = ppp.getOperationNorm6() / 8;
                daysToAdd += ppp.getOptionNorm6() / 8;
                LocalDate calculatedDate = baseDate.plusDays(daysToAdd);
                ppp.setPlanDataStart7(calculatedDate);
            } else {
                ppp.setPlanDataStart7(null);
            }
            if (ppp.getPlanDataStart7() != null && ppp.getOperationNorm7() != null  && ppp.getOptionNorm7() != null) {
                LocalDate baseDate = ppp.getPlanDataStart7();
                long daysToAdd = ppp.getOperationNorm7() / 8;
                daysToAdd += ppp.getOptionNorm7() / 8;
                LocalDate calculatedDate = baseDate.plusDays(daysToAdd);
                ppp.setPlanDataStart8(calculatedDate);
            } else {
                ppp.setPlanDataStart8(null);
            }

             if (ppp.getFactDataStart1C() != null && ppp.getOperationNorm1() != null && ppp.getOptionNorm1() != null) {
                LocalDate baseDate = ppp.getFactDataStart1C();
                long daysToAdd = ppp.getOperationNorm1() / 8;
                daysToAdd += ppp.getOptionNorm1() / 8;
                LocalDate calculatedDate = baseDate.plusDays(daysToAdd);
                ppp.setForecastDataStart1(calculatedDate);
            } else {
                ppp.setForecastDataStart1(null);
            }

            // Вычисляем ForecastDataStart2
            if (ppp.getForecastDataStart1() != null && ppp.getOperationNorm1() != null && ppp.getOptionNorm1() != null) {
                LocalDate baseDate = ppp.getForecastDataStart1();
                long daysToAdd = ppp.getOperationNorm1() / 8;
                daysToAdd += ppp.getOptionNorm1() / 8;
                LocalDate calculatedDate = baseDate.plusDays(daysToAdd);
                ppp.setForecastDataStart2(calculatedDate);
            } else {
                ppp.setForecastDataStart2(null);
            }
            // Вычисляем ForecastDataStart3
            if (ppp.getForecastDataStart2() != null && ppp.getOperationNorm2() != null && ppp.getOptionNorm2() != null) {
                LocalDate baseDate = ppp.getForecastDataStart2();
                long daysToAdd = ppp.getOperationNorm2() / 8;
                daysToAdd += ppp.getOptionNorm2() / 8;
                LocalDate calculatedDate = baseDate.plusDays(daysToAdd);
                ppp.setForecastDataStart3(calculatedDate);
            } else {
                ppp.setForecastDataStart3(null);
            }
            // Вычисляем ForecastDataStart4
            if (ppp.getForecastDataStart3() != null && ppp.getOperationNorm3() != null && ppp.getOptionNorm3() != null) {
                LocalDate baseDate = ppp.getForecastDataStart3();
                long daysToAdd = ppp.getOperationNorm3() / 8;
                daysToAdd += ppp.getOptionNorm3() / 8;
                LocalDate calculatedDate = baseDate.plusDays(daysToAdd);
                ppp.setForecastDataStart4(calculatedDate);
            } else {
                ppp.setForecastDataStart4(null);
            }
            // Вычисляем ForecastDataStart5
            if (ppp.getForecastDataStart4() != null && ppp.getOperationNorm4() != null && ppp.getOptionNorm4() != null)  {
                LocalDate baseDate = ppp.getForecastDataStart4();
                long daysToAdd = ppp.getOperationNorm4() / 8;
                daysToAdd += ppp.getOptionNorm4() / 8;
                LocalDate calculatedDate = baseDate.plusDays(daysToAdd);
                ppp.setForecastDataStart5(calculatedDate);
            } else {
                ppp.setForecastDataStart5(null);
            }
            // Вычисляем ForecastDataStart6
            if (ppp.getForecastDataStart5() != null && ppp.getOperationNorm5() != null && ppp.getOptionNorm5() != null) {
                LocalDate baseDate = ppp.getForecastDataStart5();
                long daysToAdd = ppp.getOperationNorm5() / 8;
                daysToAdd += ppp.getOptionNorm5() / 8;
                LocalDate calculatedDate = baseDate.plusDays(daysToAdd);
                ppp.setForecastDataStart6(calculatedDate);
            } else {
                ppp.setForecastDataStart6(null);
            }
            // Вычисляем ForecastDataStart7
            if (ppp.getForecastDataStart6() != null && ppp.getOperationNorm6() != null  && ppp.getOptionNorm6() != null) {
                LocalDate baseDate = ppp.getForecastDataStart6();
                long daysToAdd = ppp.getOperationNorm6() / 8;
                daysToAdd += ppp.getOptionNorm6() / 8;
                LocalDate calculatedDate = baseDate.plusDays(daysToAdd);
                ppp.setForecastDataStart7(calculatedDate);
            } else {
                ppp.setForecastDataStart7(null);
            }
            if (ppp.getForecastDataStart7() != null && ppp.getOperationNorm7() != null  && ppp.getOptionNorm7() != null) {
                LocalDate baseDate = ppp.getForecastDataStart7();
                long daysToAdd = ppp.getOperationNorm7() / 8;
                daysToAdd += ppp.getOptionNorm7() / 8;
                LocalDate calculatedDate = baseDate.plusDays(daysToAdd);
                ppp.setForecastDataStart8(calculatedDate);
            } else {
                ppp.setForecastDataStart8(null);
            }
            long sum = 0;
            Long[] operationTimes = {
                ppp.getOperationTime1(), ppp.getOperationTime2(), ppp.getOperationTime3(),
                ppp.getOperationTime4(), ppp.getOperationTime5(), ppp.getOperationTime6(),
                ppp.getOperationTime7()
            };
            
            for (Long time : operationTimes) {
                if (time != null) {
                    sum += time;
                }
            }
            ppp.setOperationTimeSum(sum);
            long summ = 0;
            Long[] problemTimes = {
                ppp.getProblemTime1(), ppp.getProblemTime2(), ppp.getProblemTime3(),
                ppp.getProblemTime4(), ppp.getProblemTime5(), ppp.getProblemTime6(),
                ppp.getProblemTime7()
            };
            
            for (Long time : problemTimes) {
                if (time != null) {
                    summ += time;
                }
            }
            ppp.setProblemTimeSum(summ);
            long procent = 0;
            long operationTimeSum = ppp.getOperationTimeSum() != null ? ppp.getOperationTimeSum() : 0; // Защита от null
            
            if (operationTimeSum != 0) {
                double procentDouble = ((double) ppp.getPlanPpp() / operationTimeSum) * 100; // Приведение к double
                procent = (long) procentDouble; // Округляем, если нужно    
            } else {
                procent = 0;
            }
            ppp.setPlanPppVar(procent);


            if (ppp.getOperationNorm1() != null && ppp.getOptionNorm1() != null  && ppp.getOperationTime1() != null && ppp.getProblemTime1() != null) {

                long var1 = ppp.getOperationNorm1();
                long var2 = ppp.getOptionNorm1();
                long var3 = ppp.getOperationTime1();
                long var4 = ppp.getProblemTime1(); // Замени на фактическое значение
            
                // Вычисляем сумму первых двух
                double sump1 = var1 + var2;
            
                // Вычисляем разность последних двух
                double difference = var3 - var4;
            
                double percentage = 0;
            
                // Проверяем, чтобы разность не была равна 0
                if (difference != 0) {
                  // Вычисляем процент
                  percentage = (sump1 / difference) * 100;
                } else {
                    // Обрабатываем случай деления на ноль (например, устанавливаем 0)
                    percentage = 0; // Или любое другое значение по умолчанию
                }
                   //приводим к long
                long percentageLong = (long)percentage;
            
                ppp.setClosingTime1(percentageLong);
            
            } else {
                ppp.setClosingTime1(null);
            }

            if (ppp.getOperationNorm2() != null && ppp.getOptionNorm2() != null  && ppp.getOperationTime2() != null && ppp.getProblemTime2() != null) {

                long var1 = ppp.getOperationNorm2();
                long var2 = ppp.getOptionNorm2();
                long var3 = ppp.getOperationTime2();
                long var4 = ppp.getProblemTime2(); // Замени на фактическое значение
            
                // Вычисляем сумму первых двух
                double sump1 = var1 + var2;
            
                // Вычисляем разность последних двух
                double difference = var3 - var4;
            
                double percentage = 0;
            
                // Проверяем, чтобы разность не была равна 0
                if (difference != 0) {
                  // Вычисляем процент
                  percentage = (sump1 / difference) * 100;
                } else {
                    // Обрабатываем случай деления на ноль (например, устанавливаем 0)
                    percentage = 0; // Или любое другое значение по умолчанию
                }
                   //приводим к long
                long percentageLong = (long)percentage;
            
                ppp.setClosingTime2(percentageLong);
            
            } else {
                ppp.setClosingTime2(null);
            }
            if (ppp.getOperationNorm3() != null && ppp.getOptionNorm3() != null  && ppp.getOperationTime3() != null && ppp.getProblemTime3() != null) {

                long var1 = ppp.getOperationNorm3();
                long var2 = ppp.getOptionNorm3();
                long var3 = ppp.getOperationTime3();
                long var4 = ppp.getProblemTime3(); // Замени на фактическое значение
            
                // Вычисляем сумму первых двух
                double sump1 = var1 + var2;
            
                // Вычисляем разность последних двух
                double difference = var3 - var4;
            
                double percentage = 0;
            
                // Проверяем, чтобы разность не была равна 0
                if (difference != 0) {
                  // Вычисляем процент
                  percentage = (sump1 / difference) * 100;
                } else {
                    // Обрабатываем случай деления на ноль (например, устанавливаем 0)
                    percentage = 0; // Или любое другое значение по умолчанию
                }
                   //приводим к long
                long percentageLong = (long)percentage;
            
                ppp.setClosingTime3(percentageLong);
            
            } else {
                ppp.setClosingTime3(null);
            }
            if (ppp.getOperationNorm4() != null && ppp.getOptionNorm4() != null  && ppp.getOperationTime4() != null && ppp.getProblemTime4() != null) {

                long var1 = ppp.getOperationNorm4();
                long var2 = ppp.getOptionNorm4();
                long var3 = ppp.getOperationTime4();
                long var4 = ppp.getProblemTime4(); // Замени на фактическое значение
            
                // Вычисляем сумму первых двух
                double sump1 = var1 + var2;
            
                // Вычисляем разность последних двух
                double difference = var3 - var4;
            
                double percentage = 0;
            
                // Проверяем, чтобы разность не была равна 0
                if (difference != 0) {
                  // Вычисляем процент
                  percentage = (sump1 / difference) * 100;
                } else {
                    // Обрабатываем случай деления на ноль (например, устанавливаем 0)
                    percentage = 0; // Или любое другое значение по умолчанию
                }
                   //приводим к long
                long percentageLong = (long)percentage;
            
                ppp.setClosingTime4(percentageLong);
            
            } else {
                ppp.setClosingTime4(null);
            }
            if (ppp.getOperationNorm5() != null && ppp.getOptionNorm5() != null  && ppp.getOperationTime5() != null && ppp.getProblemTime5() != null) {

                long var1 = ppp.getOperationNorm5();
                long var2 = ppp.getOptionNorm5();
                long var3 = ppp.getOperationTime5();
                long var4 = ppp.getProblemTime5(); // Замени на фактическое значение
            
                // Вычисляем сумму первых двух
                double sump1 = var1 + var2;
            
                // Вычисляем разность последних двух
                double difference = var3 - var4;
            
                double percentage = 0;
            
                // Проверяем, чтобы разность не была равна 0
                if (difference != 0) {
                  // Вычисляем процент
                  percentage = (sump1 / difference) * 100;
                } else {
                    // Обрабатываем случай деления на ноль (например, устанавливаем 0)
                    percentage = 0; // Или любое другое значение по умолчанию
                }
                   //приводим к long
                long percentageLong = (long)percentage;
            
                ppp.setClosingTime5(percentageLong);
            
            } else {
                ppp.setClosingTime5(null);
            }
            if (ppp.getOperationNorm6() != null && ppp.getOptionNorm6() != null  && ppp.getOperationTime6() != null && ppp.getProblemTime6() != null) {

                long var1 = ppp.getOperationNorm6();
                long var2 = ppp.getOptionNorm6();
                long var3 = ppp.getOperationTime6();
                long var4 = ppp.getProblemTime6(); // Замени на фактическое значение
            
                // Вычисляем сумму первых двух
                double sump1 = var1 + var2;
            
                // Вычисляем разность последних двух
                double difference = var3 - var4;
            
                double percentage = 0;
            
                // Проверяем, чтобы разность не была равна 0
                if (difference != 0) {
                  // Вычисляем процент
                  percentage = (sump1 / difference) * 100;
                } else {
                    // Обрабатываем случай деления на ноль (например, устанавливаем 0)
                    percentage = 0; // Или любое другое значение по умолчанию
                }
                   //приводим к long
                long percentageLong = (long)percentage;
            
                ppp.setClosingTime6(percentageLong);
            
            } else {
                ppp.setClosingTime6(null);
            }
            if (ppp.getOperationNorm7() != null && ppp.getOptionNorm7() != null  && ppp.getOperationTime7() != null && ppp.getProblemTime7() != null) {

                long var1 = ppp.getOperationNorm7();
                long var2 = ppp.getOptionNorm7();
                long var3 = ppp.getOperationTime7();
                long var4 = ppp.getProblemTime7(); // Замени на фактическое значение
            
                // Вычисляем сумму первых двух
                double sump1 = var1 + var2;
            
                // Вычисляем разность последних двух
                double difference = var3 - var4;
            
                double percentage = 0;
            
                // Проверяем, чтобы разность не была равна 0
                if (difference != 0) {
                  // Вычисляем процент
                  percentage = (sump1 / difference) * 100;
                } else {
                    // Обрабатываем случай деления на ноль (например, устанавливаем 0)
                    percentage = 0; // Или любое другое значение по умолчанию
                }
                   //приводим к long
                long percentageLong = (long)percentage;
            
                ppp.setClosingTime7(percentageLong);
            
            } else {
                ppp.setClosingTime7(null);
            }
            if (ppp.getClosingTime1() != null && ppp.getClosingTime2() != null && ppp.getClosingTime3() != null && ppp.getClosingTime4() != null && ppp.getClosingTime5() != null && ppp.getClosingTime6() != null && ppp.getClosingTime7() != null) {

                double sumpp = 0;
                int count = 0; // Счетчик не-null значений
            
                if (ppp.getClosingTime1() != null) {
                    sumpp += ppp.getClosingTime1();
                    count++;
                }
                if (ppp.getClosingTime2() != null) {
                    sumpp += ppp.getClosingTime2();
                    count++;
                }
                if (ppp.getClosingTime3() != null) {
                    sumpp  += ppp.getClosingTime3();
                    count++;
                }
                if (ppp.getClosingTime4() != null) {
                    sumpp += ppp.getClosingTime4();
                    count++;
                }
                if (ppp.getClosingTime5() != null) {
                    sumpp += ppp.getClosingTime5();
                    count++;
                }
                if (ppp.getClosingTime6() != null) {
                    sumpp += ppp.getClosingTime6();
                    count++;
                }
                if (ppp.getClosingTime7() != null) {
                    sumpp += ppp.getClosingTime7();
                    count++;
                }
            
                double average = 0;
            
                if (count > 0) {
                    average = sumpp / count;
                }
            
            
                long averageLong = (long) average; // Приводим double к long

                ppp.setClosingTimeAvg(averageLong); //  Сохраняем среднее значение
            
            } else {
                ppp.setClosingTimeAvg(null);
            }
        }
        
        return pppList;
    }
}