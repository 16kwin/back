package table.back.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import table.back.entity.Ppp;
import table.back.repository.PppRepository;

import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;


@Service
public class PppService {

    @Autowired
    private PppRepository pppRepository;

    public List<Ppp> getAllPpp() {
        List<Ppp> pppList = pppRepository.findAll();

        for (Ppp ppp : pppList) {

            if (ppp.getPlanPpp() != null) {
                    ppp.setPlanPpp(ppp.getPlanPpp() * 24); // Умножаем на 24
                }
              

            if (ppp.getStartTimePpp1() != null && ppp.getStopTimePpp1() != null) {
                LocalDateTime startTime = ppp.getStartTimePpp1();
                LocalDateTime stopTime = ppp.getStopTimePpp1();
                Duration duration = Duration.between(startTime, stopTime);
                long hours = duration.toHours();
                ppp.setOperationTime1(hours); // Устанавливаем значение в entity
            } else {
                ppp.setOperationTime1(null); // Или какое-то значение по умолчанию
            }
            if (ppp.getStartTimePpp2() != null && ppp.getStopTimePpp2() != null) {
                LocalDateTime startTime = ppp.getStartTimePpp2();
                LocalDateTime stopTime = ppp.getStopTimePpp2();
                Duration duration = Duration.between(startTime, stopTime);
                long hours = duration.toHours();
                ppp.setOperationTime2(hours); // Устанавливаем значение в entity
            } else {
                ppp.setOperationTime2(null); // Или какое-то значение по умолчанию
            }
            if (ppp.getStartTimePpp3() != null && ppp.getStopTimePpp3() != null) {
                LocalDateTime startTime = ppp.getStartTimePpp3();
                LocalDateTime stopTime = ppp.getStopTimePpp3();
                Duration duration = Duration.between(startTime, stopTime);
                long hours = duration.toHours();
                ppp.setOperationTime3(hours); // Устанавливаем значение в entity
            } else {
                ppp.setOperationTime3(null); // Или какое-то значение по умолчанию
            }
            if (ppp.getStartTimePpp4() != null && ppp.getStopTimePpp4() != null) {
                LocalDateTime startTime = ppp.getStartTimePpp4();
                LocalDateTime stopTime = ppp.getStopTimePpp4();
                Duration duration = Duration.between(startTime, stopTime);
                long hours = duration.toHours();
                ppp.setOperationTime4(hours); // Устанавливаем значение в entity
            } else {
                ppp.setOperationTime4(null); // Или какое-то значение по умолчанию
            }
            if (ppp.getStartTimePpp5() != null && ppp.getStopTimePpp5() != null) {
                LocalDateTime startTime = ppp.getStartTimePpp5();
                LocalDateTime stopTime = ppp.getStopTimePpp5();
                Duration duration = Duration.between(startTime, stopTime);
                long hours = duration.toHours();
                ppp.setOperationTime5(hours); // Устанавливаем значение в entity
            } else {
                ppp.setOperationTime5(null); // Или какое-то значение по умолчанию
            }
            if (ppp.getStartTimePpp6() != null && ppp.getStopTimePpp6() != null) {
                LocalDateTime startTime = ppp.getStartTimePpp6();
                LocalDateTime stopTime = ppp.getStopTimePpp6();
                Duration duration = Duration.between(startTime, stopTime);
                long hours = duration.toHours();
                ppp.setOperationTime6(hours); // Устанавливаем значение в entity
            } else {
                ppp.setOperationTime6(null); // Или какое-то значение по умолчанию
            }
            if (ppp.getStartTimePpp7() != null && ppp.getStopTimePpp7() != null) {
                LocalDateTime startTime = ppp.getStartTimePpp7();
                LocalDateTime stopTime = ppp.getStopTimePpp7();
                Duration duration = Duration.between(startTime, stopTime);
                long hours = duration.toHours();
                ppp.setOperationTime7(hours); // Устанавливаем значение в entity
            } else {
                ppp.setOperationTime7(null); // Или какое-то значение по умолчанию
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
        }
        return pppList;
    }
}