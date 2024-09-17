package set.exercicio;

import java.util.Date;
import java.util.Objects;

public class LogEnntry {

    private String username;
    private Date moment;

    public LogEnntry(String username, Date moment) {
        this.username = username;
        this.moment = moment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogEnntry logEnntry = (LogEnntry) o;
        return Objects.equals(username, logEnntry.username);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(username);
    }
}


