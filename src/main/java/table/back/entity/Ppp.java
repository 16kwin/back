package table.back.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "ppp") 
public class Ppp {

    @Id
    @Column(name = "transaction")
    private String transaction;

    @Column(name = "status")
    private String status;

    @Column(name = "plan_ppp")
    private Long planPpp;

    @Column(name = "option_norm_1")
    private Long optionNorm1;

    @Column(name = "option_norm_2")
    private Long optionNorm2;

    @Column(name = "option_norm_3")
    private Long optionNorm3;

    @Column(name = "option_norm_4")
    private Long optionNorm4;

    @Column(name = "option_norm_5")
    private Long optionNorm5;

    @Column(name = "option_norm_6")
    private Long optionNorm6;

    @Column(name = "option_norm_7")
    private Long optionNorm7;
    
    @Column(name = "operation_norm_1")
    private Long operationNorm1;

    @Column(name = "operation_norm_2")
    private Long operationNorm2;

    @Column(name = "operation_norm_3")
    private Long operationNorm3;

    @Column(name = "operation_norm_4")
    private Long operationNorm4;

    @Column(name = "operation_norm_5")
    private Long operationNorm5;

    @Column(name = "operation_norm_6")
    private Long operationNorm6;

    @Column(name = "operation_norm_7")
    private Long operationNorm7;

    @Column(name = "problem_time_1")
    private Long problemTime1;

    @Column(name = "problem_time_2")
    private Long problemTime2;

    @Column(name = "problem_time_3")
    private Long problemTime3;

    @Column(name = "problem_time_4")
    private Long problemTime4;

    @Column(name = "problem_time_5")
    private Long problemTime5;

    @Column(name = "problem_time_6")
    private Long problemTime6;

    @Column(name = "problem_time_7")
    private Long problemTime7;

    @Column(name = "start_time_ppp_1")
    private LocalDateTime startTimePpp1;

    @Column(name = "start_time_ppp_2")
    private LocalDateTime startTimePpp2;

    @Column(name = "start_time_ppp_3")
    private LocalDateTime startTimePpp3;

    @Column(name = "start_time_ppp_4")
    private LocalDateTime startTimePpp4;

    @Column(name = "start_time_ppp_5")
    private LocalDateTime startTimePpp5;

    @Column(name = "start_time_ppp_6")
    private LocalDateTime startTimePpp6;

    @Column(name = "start_time_ppp_7")
    private LocalDateTime startTimePpp7;

    @Column(name = "plan_data_start")
    private LocalDate planDataStart1C;

    @Column(name = "forecast_data_start")
    private LocalDate forecastDataStart1C;

    @Column(name = "fact_data_start")
    private LocalDate factDataStart1C;

    @Column(name = "stop_time_ppp_1")
    private LocalDateTime stopTimePpp1;

    @Column(name = "stop_time_ppp_2")
    private LocalDateTime stopTimePpp2;

    @Column(name = "stop_time_ppp_3")
    private LocalDateTime stopTimePpp3;

    @Column(name = "stop_time_ppp_4")
    private LocalDateTime stopTimePpp4;

    @Column(name = "stop_time_ppp_5")
    private LocalDateTime stopTimePpp5;

    @Column(name = "stop_time_ppp_6")
    private LocalDateTime stopTimePpp6;

    @Column(name = "stop_time_ppp_7")
    private LocalDateTime stopTimePpp7;

    @Column(name = "plan_data_stop")
    private LocalDate planDataStop1C;

    @Column(name = "forecast_data_stop")
    private LocalDate forecastDataStop1C;

    @Column(name = "fact_data_stop")
    private LocalDate factDataStop1C;

    @Column(name = "plan_data_shipment")
    private LocalDate planDataShipment1C;

    @Column(name = "forecast_data_shipment")
    private LocalDate forecastDataShipment1C;

    @Column(name = "fact_data_shipment")
    private LocalDate factDataShipment1C;


    @Transient // Это поле не будет сохраняться в базе данных
    private Long closingTime1;

    public Long getClosingTime1() {
        return closingTime1;
    }

    public void setClosingTime1(Long closingTime1) {
        this.closingTime1 = closingTime1;
    }
    @Transient // Это поле не будет сохраняться в базе данных
    private Long closingTime2;

    public Long getClosingTime2() {
        return closingTime2;
    }

    public void setClosingTime2(Long closingTime2) {
        this.closingTime2 = closingTime2;
    }
    @Transient // Это поле не будет сохраняться в базе данных
    private Long closingTime3;

    public Long getClosingTime3() {
        return closingTime3;
    }

    public void setClosingTime3(Long closingTime3) {
        this.closingTime3 = closingTime3;
    }
    @Transient // Это поле не будет сохраняться в базе данных
    private Long closingTime4;

    public Long getClosingTime4() {
        return closingTime4;
    }

    public void setClosingTime4(Long closingTime4) {
        this.closingTime4 = closingTime4;
    }
    @Transient // Это поле не будет сохраняться в базе данных
    private Long closingTime5;

    public Long getClosingTime5() {
        return closingTime5;
    }

    public void setClosingTime5(Long closingTime5) {
        this.closingTime5 = closingTime5;
    }
    @Transient // Это поле не будет сохраняться в базе данных
    private Long closingTime6;

    public Long getClosingTime6() {
        return closingTime6;
    }

    public void setClosingTime6(Long closingTime6) {
        this.closingTime6 = closingTime6;
    }
    @Transient // Это поле не будет сохраняться в базе данных
    private Long closingTime7;

    public Long getClosingTime7() {
        return closingTime7;
    }

    public void setClosingTime7(Long closingTime7) {
        this.closingTime7 = closingTime7;
    }
    @Transient // Это поле не будет сохраняться в базе данных
    private Long closingTimeAvg;

    public Long getClosingTimeAvg() {
        return closingTimeAvg;
    }

    public void setClosingTimeAvg(Long closingTimeAvg) {
        this.closingTimeAvg = closingTimeAvg;
    }
    @Transient // Это поле не будет сохраняться в базе данных
    private Long planPppVar;

    public Long getPlanPppVar() {
        return planPppVar;
    }

    public void setPlanPppVar(Long planPppVar) {
        this.planPppVar = planPppVar;
    }
    @Transient // Это поле не будет сохраняться в базе данных
    private Long problemTimeSum;

    public Long getProblemTimeSum() {
        return problemTimeSum;
    }

    public void setProblemTimeSum(Long problemTimeSum) {
        this.problemTimeSum = problemTimeSum;
    }


    @Transient // Это поле не будет сохраняться в базе данных
    private LocalDate planDataStart1;

    public LocalDate getPlanDataStart1() {
        return planDataStart1;
    }

    public void setPlanDataStart1(LocalDate planDataStart1) {
        this.planDataStart1 = planDataStart1;
    }


    @Transient // Это поле не будет сохраняться в базе данных
    private LocalDate planDataStart2;

    public LocalDate getPlanDataStart2() {
        return planDataStart2;
    }

    public void setPlanDataStart2(LocalDate planDataStart2) {
        this.planDataStart2 = planDataStart2;
    }
    @Transient // Это поле не будет сохраняться в базе данных
    private LocalDate planDataStart3;

    public LocalDate getPlanDataStart3() {
        return planDataStart3;
    }

    public void setPlanDataStart3(LocalDate planDataStart3) {
        this.planDataStart3 = planDataStart3;
    }
    @Transient // Это поле не будет сохраняться в базе данных
    private LocalDate planDataStart4;

    public LocalDate getPlanDataStart4() {
        return planDataStart4;
    }

    public void setPlanDataStart4(LocalDate planDataStart4) {
        this.planDataStart4 = planDataStart4;
    }
    @Transient // Это поле не будет сохраняться в базе данных
    private LocalDate planDataStart5;

    public LocalDate getPlanDataStart5() {
        return planDataStart5;
    }

    public void setPlanDataStart5(LocalDate planDataStart5) {
        this.planDataStart5 = planDataStart5;
    }
    @Transient // Это поле не будет сохраняться в базе данных
    private LocalDate planDataStart6;

    public LocalDate getPlanDataStart6() {
        return planDataStart6;
    }

    public void setPlanDataStart6(LocalDate planDataStart6) {
        this.planDataStart6 = planDataStart6;
    }
    @Transient // Это поле не будет сохраняться в базе данных
    private LocalDate planDataStart7;

    public LocalDate getPlanDataStart7() {
        return planDataStart7;
    }

    public void setPlanDataStart7(LocalDate planDataStart7) {
        this.planDataStart7 = planDataStart7;
    }
    @Transient // Это поле не будет сохраняться в базе данных
    private LocalDate planDataStart8;

    public LocalDate getPlanDataStart8() {
        return planDataStart8;
    }

    public void setPlanDataStart8(LocalDate planDataStart8) {
        this.planDataStart8 = planDataStart8;
    }




    
    @Transient // Это поле не будет сохраняться в базе данных
    private LocalDate forecastDataStart1;

    public LocalDate getForecastDataStart1() {
        return forecastDataStart1;
    }
    
    public void setForecastDataStart1(LocalDate forecastDataStart1) {
        this.forecastDataStart1 = forecastDataStart1;
    }

    @Transient // Это поле не будет сохраняться в базе данных
    private LocalDate forecastDataStart2;

    public LocalDate getForecastDataStart2() {
        return forecastDataStart2;
    }

    public void setForecastDataStart2(LocalDate forecastDataStart2) {
        this.forecastDataStart2 = forecastDataStart2;
    }
    @Transient // Это поле не будет сохраняться в базе данных
    private LocalDate forecastDataStart3;

    public LocalDate getForecastDataStart3() {
        return forecastDataStart3;
    }

    public void setForecastDataStart3(LocalDate forecastDataStart3) {
        this.forecastDataStart3 = forecastDataStart3;
    }
    @Transient // Это поле не будет сохраняться в базе данных
    private LocalDate forecastDataStart4;

    public LocalDate getForecastDataStart4() {
        return forecastDataStart4;
    }

    public void setForecastDataStart4(LocalDate forecastDataStart4) {
        this.forecastDataStart4 = forecastDataStart4;
    }
    @Transient // Это поле не будет сохраняться в базе данных
    private LocalDate forecastDataStart5;

    public LocalDate getForecastDataStart5() {
        return forecastDataStart5;
    }

    public void setForecastDataStart5(LocalDate forecastDataStart5) {
        this.forecastDataStart5 = forecastDataStart5;
    }
    @Transient // Это поле не будет сохраняться в базе данных
    private LocalDate forecastDataStart6;

    public LocalDate getForecastDataStart6() {
        return forecastDataStart6;
    }

    public void setForecastDataStart6(LocalDate forecastDataStart6) {
        this.forecastDataStart6 = forecastDataStart6;
    }
    @Transient // Это поле не будет сохраняться в базе данных
    private LocalDate forecastDataStart7;

    public LocalDate getForecastDataStart7() {
        return forecastDataStart7;
    }

    public void setForecastDataStart7(LocalDate forecastDataStart7) {
        this.forecastDataStart7 = planDataStart7;
    }
    @Transient // Это поле не будет сохраняться в базе данных
    private LocalDate forecastDataStart8;

    public LocalDate getForecastDataStart8() {
        return forecastDataStart8;
    }

    public void setForecastDataStart8(LocalDate forecastDataStart8) {
        this.forecastDataStart8 = planDataStart8;
    }

    @Transient // Это поле не будет сохраняться в базе данных
    private Long operationTime1;

    public Long getOperationTime1() {
        return operationTime1;
    }

    public void setOperationTime1(Long operationTime1) {
        this.operationTime1 = operationTime1;
    }
    @Transient // Это поле не будет сохраняться в базе данных
    private Long operationTime2;

    public Long getOperationTime2() {
        return operationTime2;
    }

    public void setOperationTime2(Long operationTime2) {
        this.operationTime2 = operationTime2;
    }
    @Transient // Это поле не будет сохраняться в базе данных
    private Long operationTime3;

    public Long getOperationTime3() {
        return operationTime3;
    }

    public void setOperationTime3(Long operationTime3) {
        this.operationTime3 = operationTime3;
    }
    @Transient // Это поле не будет сохраняться в базе данных
    private Long operationTime4;

    public Long getOperationTime4() {
        return operationTime4;
    }

    public void setOperationTime4(Long operationTime4) {
        this.operationTime4 = operationTime4;
    }
    @Transient // Это поле не будет сохраняться в базе данных
    private Long operationTime5;

    public Long getOperationTime5() {
        return operationTime5;
    }

    public void setOperationTime5(Long operationTime5) {
        this.operationTime5 = operationTime5;
    }
    @Transient // Это поле не будет сохраняться в базе данных
    private Long operationTime6;

    public Long getOperationTime6() {
        return operationTime6;
    }

    public void setOperationTime6(Long operationTime6) {
        this.operationTime6 = operationTime6;
    }
    @Transient // Это поле не будет сохраняться в базе данных
    private Long operationTime7;

    public Long getOperationTime7() {
        return operationTime7;
    }

    public void setOperationTime7(Long operationTime7) {
        this.operationTime7 = operationTime7;
    }



    @Transient // Это поле не будет сохраняться в базе данных
    private Long operationTimeSum;

    public Long getOperationTimeSum() {
        return operationTimeSum;
    }

    public void setOperationTimeSum(Long operationTimeSum) {
        this.operationTimeSum = operationTimeSum;}



    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public Long getPlanPpp() {
        return planPpp;
    }

    public void setPlanPpp(Long planPpp) {
        this.planPpp = planPpp;
    }

    public Long getOptionNorm1() {
        return optionNorm1;
    }

    public void setOptionNorm1(Long optionNorm1) {
        this.optionNorm1 = optionNorm1;
    }

    public Long getOptionNorm2() {
        return optionNorm2;
    }

    public void setOptionNorm2(Long optionNorm2) {
        this.optionNorm2 = optionNorm2;
    }

    public Long getOptionNorm3() {
        return optionNorm3;
    }

    public void setOptionNorm3(Long optionNorm3) {
        this.optionNorm3 = optionNorm3;
    }

    public Long getOptionNorm4() {
        return optionNorm4;
    }

    public void setOptionNorm4(Long optionNorm4) {
        this.optionNorm4 = optionNorm4;
    }

    public Long getOptionNorm5() {
        return optionNorm5;
    }

    public void setOptionNorm5(Long optionNorm5) {
        this.optionNorm5 = optionNorm5;
    }

    public Long getOptionNorm6() {
        return optionNorm6;
    }

    public void setOptionNorm6(Long optionNorm6) {
        this.optionNorm6 = optionNorm6;
    }

    public Long getOptionNorm7() {
        return optionNorm7;
    }

    public void setOptionNorm7(Long optionNorm7) {
        this.optionNorm7 = optionNorm7;
    }
    public Long getOperationNorm1() {
        return operationNorm1;
    }

    public void setOperationNorm1(Long operationNorm1) {
        this.operationNorm1 = operationNorm1;
    }

    public Long getOperationNorm2() {
        return operationNorm2;
    }

    public void setOperationNorm2(Long operationNorm2) {
        this.operationNorm2 = operationNorm2;
    }

    public Long getOperationNorm3() {
        return operationNorm3;
    }

    public void setOperationNorm3(Long operationNorm3) {
        this.operationNorm3 = operationNorm3;
    }

    public Long getOperationNorm4() {
        return operationNorm4;
    }

    public void setOperationNorm4(Long operationNorm4) {
        this.operationNorm4 = operationNorm4;
    }

    public Long getOperationNorm5() {
        return operationNorm5;
    }

    public void setOperationNorm5(Long operationNorm5) {
        this.operationNorm5 = operationNorm5;
    }

    public Long getOperationNorm6() {
        return operationNorm6;
    }

    public void setOperationNorm6(Long operationNorm6) {
        this.operationNorm6 = operationNorm6;
    }

    public Long getOperationNorm7() {
        return operationNorm7;
    }

    public void setOperationNorm7(Long operationNorm7) {
        this.operationNorm7 = operationNorm7;
    }

    public Long getProblemTime1() {
        return problemTime1;
    }

    public void setProblemTime1(Long problemTime1) {
        this.problemTime1 = problemTime1;
    }

    public Long getProblemTime2() {
        return problemTime2;
    }

    public void setProblemTime2(Long problemTime2) {
        this.problemTime2 = problemTime2;
    }

    public Long getProblemTime3() {
        return problemTime3;
    }

    public void setProblemTime3(Long problemTime3) {
        this.problemTime3 = problemTime3;
    }

    public Long getProblemTime4() {
        return problemTime4;
    }

    public void setProblemTime4(Long problemTime4) {
        this.problemTime4 = problemTime4;
    }

    public Long getProblemTime5() {
        return problemTime5;
    }

    public void setProblemTime5(Long problemTime5) {
        this.problemTime5 = problemTime5;
    }

    public Long getProblemTime6() {
        return problemTime6;
    }

    public void setProblemTime6(Long problemTime6) {
        this.problemTime6 = problemTime6;
    }

    public Long getProblemTime7() {
        return problemTime7;
    }

    public void setProblemTime7(Long problemTime7) {
        this.problemTime7 = problemTime7;
    }

    public LocalDateTime getStartTimePpp1() {
        return startTimePpp1;
    }

    public void setStartTimePpp1(LocalDateTime startTimePpp1) {
        this.startTimePpp1 = startTimePpp1;
    }

    public LocalDateTime getStartTimePpp2() {
        return startTimePpp2;
    }

    public void setStartTimePpp2(LocalDateTime startTimePpp2) {
        this.startTimePpp2 = startTimePpp2;
    }

    public LocalDateTime getStartTimePpp3() {
        return startTimePpp3;
    }

    public void setStartTimePpp3(LocalDateTime startTimePpp3) {
        this.startTimePpp3 = startTimePpp3;
    }

    public LocalDateTime getStartTimePpp4() {
        return startTimePpp4;
    }

    public void setStartTimePpp4(LocalDateTime startTimePpp4) {
        this.startTimePpp4 = startTimePpp4;
    }

    public LocalDateTime getStartTimePpp5() {
        return startTimePpp5;
    }

    public void setStartTimePpp5(LocalDateTime startTimePpp5) {
        this.startTimePpp5 = startTimePpp5;
    }

    public LocalDateTime getStartTimePpp6() {
        return startTimePpp6;
    }

    public void setStartTimePpp6(LocalDateTime startTimePpp6) {
        this.startTimePpp6 = startTimePpp6;
    }

    public LocalDateTime getStartTimePpp7() {
        return startTimePpp7;
    }

    public void setStartTimePpp7(LocalDateTime startTimePpp7) {
        this.startTimePpp7 = startTimePpp7;
    }

    public LocalDate getPlanDataStart1C() {
        return planDataStart1C;
    }

    public void setPlanDataStart1C(LocalDate planDataStart1C) {
        this.planDataStart1C = planDataStart1C;
    }

    public LocalDate getForecastDataStart1C() {
        return forecastDataStart1C;
    }

    public void setForecastDataStart1C(LocalDate forecastDataStart1C) {
        this.forecastDataStart1C = forecastDataStart1C;
    }

    public LocalDate getFactDataStart1C() {
        return factDataStart1C;
    }

    public void setFactDataStart1C(LocalDate factDataStart1C) {
        this.factDataStart1C = factDataStart1C;
    }

    public LocalDateTime getStopTimePpp1() {
        return stopTimePpp1;
    }

    public void setStopTimePpp1(LocalDateTime stopTimePpp1) {
        this.stopTimePpp1 = stopTimePpp1;
    }

    public LocalDateTime getStopTimePpp2() {
        return stopTimePpp2;
    }

    public void setStopTimePpp2(LocalDateTime stopTimePpp2) {
        this.stopTimePpp2 = stopTimePpp2;
    }

    public LocalDateTime getStopTimePpp3() {
        return stopTimePpp3;
    }

    public void setStopTimePpp3(LocalDateTime stopTimePpp3) {
        this.stopTimePpp3 = stopTimePpp3;
    }

    public LocalDateTime getStopTimePpp4() {
        return stopTimePpp4;
    }

    public void setStopTimePpp4(LocalDateTime stopTimePpp4) {
        this.stopTimePpp4 = stopTimePpp4;
    }

    public LocalDateTime getStopTimePpp5() {
        return stopTimePpp5;
    }

    public void setStopTimePpp5(LocalDateTime stopTimePpp5) {
        this.stopTimePpp5 = stopTimePpp5;
    }

    public LocalDateTime getStopTimePpp6() {
        return stopTimePpp6;
    }

    public void setStopTimePpp6(LocalDateTime stopTimePpp6) {
        this.stopTimePpp6 = stopTimePpp6;
    }

    public LocalDateTime getStopTimePpp7() {
        return stopTimePpp7;
    }

    public void setStopTimePpp7(LocalDateTime stopTimePpp7) {
        this.stopTimePpp7 = stopTimePpp7;
    }

    public LocalDate getPlanDataStop1C() {
        return planDataStop1C;
    }

    public void setPlanDataStop1C(LocalDate planDataStop1C) {
        this.planDataStop1C = planDataStop1C;
    }

    public LocalDate getForecastDataStop1C() {
        return forecastDataStop1C;
    }

    public void setForecastDataStop1C(LocalDate forecastDataStop1C) {
        this.forecastDataStop1C = forecastDataStop1C;
    }

    public LocalDate getFactDataStop1C() {
        return factDataStop1C;
    }

    public void setFactDataStop1C(LocalDate factDataStop1C) {
        this.factDataStop1C = factDataStop1C;
    }

    public LocalDate getPlanDataShipment1C() {
        return planDataShipment1C;
    }

    public void setPlanDataShipment1C(LocalDate planDataShipment1C) {
        this.planDataShipment1C = planDataShipment1C;
    }

    public LocalDate getForecastDataShipment1C() {
        return forecastDataShipment1C;
    }

    public void setForecastDataShipment1C(LocalDate forecastDataShipment1C) {
        this.forecastDataShipment1C = forecastDataShipment1C;
    }

    public LocalDate getFactDataShipment1C() {
        return factDataShipment1C;
    }

    public void setFactDataShipment1C(LocalDate factDataShipment1C) {
        this.factDataShipment1C = factDataShipment1C;
    }

    @Override
    public String toString() {
        return "Ppp{" +
                "transaction='" + transaction + '\'' +
                ", status='" + status + '\'' +
                ", planPpp=" + planPpp +
                ", optionNorm1=" + optionNorm1 +
                ", optionNorm2=" + optionNorm2 +
                ", optionNorm3=" + optionNorm3 +
                ", optionNorm4=" + optionNorm4 +
                ", optionNorm5=" + optionNorm5 +
                ", optionNorm6=" + optionNorm6 +
                ", optionNorm7=" + optionNorm7 +
                ", operationNorm1=" + operationNorm1 +
                ", operationNorm2=" + operationNorm2 +
                ", operationNorm3=" + operationNorm3 +
                ", operationNorm4=" + operationNorm4 +
                ", operationNorm5=" + operationNorm5 +
                ", operationNorm6=" + operationNorm6 +
                ", operationNorm7=" + operationNorm7 +
                ", problemTime1=" + problemTime1 +
                ", problemTime2=" + problemTime2 +
                ", problemTime3=" + problemTime3 +
                ", problemTime4=" + problemTime4 +
                ", problemTime5=" + problemTime5 +
                ", problemTime6=" + problemTime6 +
                ", problemTime7=" + problemTime7 +
                ", startTimePpp1=" + startTimePpp1 +
                ", startTimePpp2=" + startTimePpp2 +
                ", startTimePpp3=" + startTimePpp3 +
                ", startTimePpp4=" + startTimePpp4 +
                ", startTimePpp5=" + startTimePpp5 +
                ", startTimePpp6=" + startTimePpp6 +
                ", startTimePpp7=" + startTimePpp7 +
                ", planDataStart1C=" + planDataStart1C +
                ", forecastDataStart1C=" + forecastDataStart1C +
                ", factDataStart1C=" + factDataStart1C +
                ", stopTimePpp1=" + stopTimePpp1 +
                ", stopTimePpp2=" + stopTimePpp2 +
                ", stopTimePpp3=" + stopTimePpp3 +
                ", stopTimePpp4=" + stopTimePpp4 +
                ", stopTimePpp5=" + stopTimePpp5 +
                ", stopTimePpp6=" + stopTimePpp6 +
                ", stopTimePpp7=" + stopTimePpp7 +
                ", planDataStop1C=" + planDataStop1C +
                ", forecastDataStop1C=" + forecastDataStop1C +
                ", factDataStop1C=" + factDataStop1C +
                ", planDataShipment1C=" + planDataShipment1C +
                ", forecastDataShipment1C=" + forecastDataShipment1C +
                ", factDataShipment1C=" + factDataShipment1C +
                '}';
    }
}