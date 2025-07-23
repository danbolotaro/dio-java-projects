package Clocks;

public non-sealed class USClock extends Clock {

    private String periodIndicator;

    public void setHour(int hour) {
        setBerforeMidDay();

       if(hour > 12 && hour <= 23){
           this.hour = hour - 12;
           setAfterMidDay();
       } else if(hour >= 24){
           this.hour = 0;
       } else {
           this.hour = hour;
       }
    }

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setAfterMidDay() {
        this.periodIndicator = "PM";
    }

    public void setBerforeMidDay() {
        this.periodIndicator = "AM";
    }

    @Override
    public Clock convert(final Clock clock) {
        this.minute = clock.getMinute();
        this.second = clock.getSecond();

        switch(clock){
            case USClock usClock -> {
                this.hour = usClock.getHour();
                this.periodIndicator = usClock.getPeriodIndicator();
            }
            case BRLClock brlClock -> this.setHour(brlClock.getHour());

        }
        return this;
    }

    @Override
    public String getTime() {
        return super.getTime() + " " + this.periodIndicator;
    }

}
