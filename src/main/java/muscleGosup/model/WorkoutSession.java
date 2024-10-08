package muscleGosup.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

@Entity
@Table(name= "workoutSessions")
public class WorkoutSession {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String title;

    @JsonIgnore
    @ManyToOne
    private User user;
    // Store in seconds 
    private Long duration;

    private LocalDateTime date;

    @OneToMany(mappedBy = "workoutSession", cascade = CascadeType.ALL)
    private List<Exercise> exercises = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public User getUser()
    {
        return this.user;
    }

    public void setUser(User user){
        this.user = user;
    }

    public List<Exercise> getExercises(){
        return this.exercises;
    }
    
    public void setExercises(List<Exercise> exercises){
        this.exercises = exercises;
    }
}
