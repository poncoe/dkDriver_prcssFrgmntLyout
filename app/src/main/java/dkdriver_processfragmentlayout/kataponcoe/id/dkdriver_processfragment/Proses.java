package dkdriver_processfragmentlayout.kataponcoe.id.dkdriver_processfragment;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by docotel on 3/7/16.
 */
public class Proses implements Parcelable {

    private int id;
    private String name;
    private String team;
    private String time;

    public Proses() {
    }

    protected Proses(Parcel in) {
        id = in.readInt();
        name = in.readString();
        team = in.readString();
        time = in.readString();
    }

    public static final Creator<Proses> CREATOR = new Creator<Proses>() {
        @Override
        public Proses createFromParcel(Parcel in) {
            return new Proses(in);
        }

        @Override
        public Proses[] newArray(int size) {
            return new Proses[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    //

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(name);
        dest.writeString(team);
        dest.writeString(time);
    }
}
