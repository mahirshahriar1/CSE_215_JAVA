package Folder1;

import java.io.*;


public class Job implements Serializable{       
    
    private double salary;
    private String nameOfJob;

    public Job(double salary, String nameOfJob) {
        this.salary = salary;
        this.nameOfJob = nameOfJob;
    }
    public boolean equals(Job job)
    {
        return (this.salary==job.salary && 
                this.nameOfJob.equals(job.nameOfJob));
    }    

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getNameOfJob() {
        return nameOfJob;
    }

    public void setNameOfJob(String nameOfJob) {
        this.nameOfJob = nameOfJob;
    }
    
    
}
