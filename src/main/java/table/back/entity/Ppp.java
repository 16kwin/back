package table.back.entity;

import jakarta.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

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
    private Timestamp startTimePpp1;

    @Column(name = "start_time_ppp_2")
    private Timestamp startTimePpp2;

    @Column(name = "start_time_ppp_3")
    private Timestamp startTimePpp3;

    @Column(name = "start_time_ppp_4")
    private Timestamp startTimePpp4;

    @Column(name = "start_time_ppp_5")
    private Timestamp startTimePpp5;

    @Column(name = "start_time_ppp_6")
    private Timestamp startTimePpp6;

    @Column(name = "start_time_ppp_7")
    private Timestamp startTimePpp7;

    @Column(name = "plan_data_start")
    private Date planDataStart1C;

    @Column(name = "forecast_data_start")
    private Date forecastDataStart1C;

    @Column(name = "fact_data_start")
    private Date factDataStart1C;

    @Column(name = "stop_time_ppp_1")
    private Timestamp stopTimePpp1;

    @Column(name = "stop_time_ppp_2")
    private Timestamp stopTimePpp2;

    @Column(name = "stop_time_ppp_3")
    private Timestamp stopTimePpp3;

    @Column(name = "stop_time_ppp_4")
    private Timestamp stopTimePpp4;

    @Column(name = "stop_time_ppp_5")
    private Timestamp stopTimePpp5;

    @Column(name = "stop_time_ppp_6")
    private Timestamp stopTimePpp6;

    @Column(name = "stop_time_ppp_7")
    private Timestamp stopTimePpp7;

    @Column(name = "plan_data_stop")
    private Date planDataStop1C;

    @Column(name = "forecast_data_stop")
    private Date forecastDataStop1C;

    @Column(name = "fact_data_stop")
    private Date factDataStop1C;

    @Column(name = "plan_data_shipment")
    private Date planDataShipment1C;

    @Column(name = "forecast_data_shipment")
    private Date forecastDataShipment1C;

    @Column(name = "fact_data_shipment")
    private Date factDataShipment1C;

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

    public Timestamp getStartTimePpp1() {
        return startTimePpp1;
    }

    public void setStartTimePpp1(Timestamp startTimePpp1) {
        this.startTimePpp1 = startTimePpp1;
    }

    public Timestamp getStartTimePpp2() {
        return startTimePpp2;
    }

    public void setStartTimePpp2(Timestamp startTimePpp2) {
        this.startTimePpp2 = startTimePpp2;
    }

    public Timestamp getStartTimePpp3() {
        return startTimePpp3;
    }

    public void setStartTimePpp3(Timestamp startTimePpp3) {
        this.startTimePpp3 = startTimePpp3;
    }

    public Timestamp getStartTimePpp4() {
        return startTimePpp4;
    }

    public void setStartTimePpp4(Timestamp startTimePpp4) {
        this.startTimePpp4 = startTimePpp4;
    }

    public Timestamp getStartTimePpp5() {
        return startTimePpp5;
    }

    public void setStartTimePpp5(Timestamp startTimePpp5) {
        this.startTimePpp5 = startTimePpp5;
    }

    public Timestamp getStartTimePpp6() {
        return startTimePpp6;
    }

    public void setStartTimePpp6(Timestamp startTimePpp6) {
        this.startTimePpp6 = startTimePpp6;
    }

    public Timestamp getStartTimePpp7() {
        return startTimePpp7;
    }

    public void setStartTimePpp7(Timestamp startTimePpp7) {
        this.startTimePpp7 = startTimePpp7;
    }

    public Date getPlanDataStart1C() {
        return planDataStart1C;
    }

    public void setPlanDataStart1C(Date planDataStart1C) {
        this.planDataStart1C = planDataStart1C;
    }

    public Date getForecastDataStart1C() {
        return forecastDataStart1C;
    }

    public void setForecastDataStart1C(Date forecastDataStart1C) {
        this.forecastDataStart1C = forecastDataStart1C;
    }

    public Date getFactDataStart1C() {
        return factDataStart1C;
    }

    public void setFactDataStart1C(Date factDataStart1C) {
        this.factDataStart1C = factDataStart1C;
    }

    public Timestamp getStopTimePpp1() {
        return stopTimePpp1;
    }

    public void setStopTimePpp1(Timestamp stopTimePpp1) {
        this.stopTimePpp1 = stopTimePpp1;
    }

    public Timestamp getStopTimePpp2() {
        return stopTimePpp2;
    }

    public void setStopTimePpp2(Timestamp stopTimePpp2) {
        this.stopTimePpp2 = stopTimePpp2;
    }

    public Timestamp getStopTimePpp3() {
        return stopTimePpp3;
    }

    public void setStopTimePpp3(Timestamp stopTimePpp3) {
        this.stopTimePpp3 = stopTimePpp3;
    }

    public Timestamp getStopTimePpp4() {
        return stopTimePpp4;
    }

    public void setStopTimePpp4(Timestamp stopTimePpp4) {
        this.stopTimePpp4 = stopTimePpp4;
    }

    public Timestamp getStopTimePpp5() {
        return stopTimePpp5;
    }

    public void setStopTimePpp5(Timestamp stopTimePpp5) {
        this.stopTimePpp5 = stopTimePpp5;
    }

    public Timestamp getStopTimePpp6() {
        return stopTimePpp6;
    }

    public void setStopTimePpp6(Timestamp stopTimePpp6) {
        this.stopTimePpp6 = stopTimePpp6;
    }

    public Timestamp getStopTimePpp7() {
        return stopTimePpp7;
    }

    public void setStopTimePpp7(Timestamp stopTimePpp7) {
        this.stopTimePpp7 = stopTimePpp7;
    }

    public Date getPlanDataStop1C() {
        return planDataStop1C;
    }

    public void setPlanDataStop1C(Date planDataStop1C) {
        this.planDataStop1C = planDataStop1C;
    }

    public Date getForecastDataStop1C() {
        return forecastDataStop1C;
    }

    public void setForecastDataStop1C(Date forecastDataStop1C) {
        this.forecastDataStop1C = forecastDataStop1C;
    }

    public Date getFactDataStop1C() {
        return factDataStop1C;
    }

    public void setFactDataStop1C(Date factDataStop1C) {
        this.factDataStop1C = factDataStop1C;
    }

    public Date getPlanDataShipment1C() {
        return planDataShipment1C;
    }

    public void setPlanDataShipment1C(Date planDataShipment1C) {
        this.planDataShipment1C = planDataShipment1C;
    }

    public Date getForecastDataShipment1C() {
        return forecastDataShipment1C;
    }

    public void setForecastDataShipment1C(Date forecastDataShipment1C) {
        this.forecastDataShipment1C = forecastDataShipment1C;
    }

    public Date getFactDataShipment1C() {
        return factDataShipment1C;
    }

    public void setFactDataShipment1C(Date factDataShipment1C) {
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