/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imd.telemaco.presentation;

import com.imd.telemaco.business.ProgramServices;
import com.imd.telemaco.presentation.audiovisual.SelectAllAudiovisuals;

/**
 *
 * @author franklin
 */
public class SelectAllPrograms extends SelectAllAudiovisuals {

    @Override
    public void init() {
        this.services = new ProgramServices();
    }
}
