package com.imd.telemaco.entity;

import java.time.Clock;
import java.util.ArrayList;

import com.imd.telemaco.entity.enums.Classification;

/**
 * This class represents a TV channel Program object. Its fields are TV channel,
 * schedule, presenters and ratings.
 *
 * @author Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 4 de jun de 2018 | 11:06:36
 */
public class Program extends AudioVisual {

    private String TVchannel;
    private Clock schedule;
    private ArrayList<Rating> ratings;

    /**
     * Default Constructor
     */
    public Program() {
    }

    /**
     * Parameterized Constructor
     *
     * @param name
     * @param status
     * @param synopsis
     * @param image
     * @param classif
     * @param TVchannel
     * @param schedule
     */
    public Program(String name, String status, String synopsis, String image, Classification classif, String TVchannel,
            Clock schedule) {
        super(name, status, synopsis, image, classif);
        this.TVchannel = TVchannel;
        this.schedule = schedule;
        this.ratings = new ArrayList<>();
    }

    /**
     * Parameterized Constructor by the id
     *
     * @param id
     * @param name
     * @param status
     * @param synopsis
     * @param image
     * @param classif
     * @param ratigns
     * @param TVchannel
     * @param schedule
     */
    public Program(int id, String name, String status, String synopsis, String image, Classification classif, ArrayList<Rating> ratigns,
            String TVchannel, Clock schedule) {
        super(id, name, status, synopsis, image, classif, ratigns);
        this.TVchannel = TVchannel;
        this.schedule = schedule;
        this.ratings = new ArrayList<>();
    }

    /**
     * Returns the TV channel of the Program
     *
     * @return TVchannel
     */
    public String getTVchannel() {
        return TVchannel;
    }

    /**
     * Returns the schedule of the Program
     *
     * @return schedule
     */
    public Clock getSchedule() {
        return schedule;
    }

    /**
     * Returns the ratings of the Program
     *
     * @return ratings
     */
    public ArrayList<Rating> getRatings() {
        return ratings;
    }

    /**
     * This method add a rating in the Ratings list of the Program
     *
     * @param rating
     */
    @Override
    public void addRating(Rating rating) {
        ratings.add(rating);
    }
}
