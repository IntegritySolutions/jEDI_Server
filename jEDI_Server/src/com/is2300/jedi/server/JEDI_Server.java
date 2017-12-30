/*
 * Copyright (C) 2017 Integrity Solutions
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.is2300.jedi.server;

import com.is2300.jedi.server.utils.Utilities;

/**
 * <h2>jEDI_Server</h2>
 * <h3>Basic Description</h3>
 * <p>Server side application for parsing incoming and sending outgoing EDI 
 * files.</p>
 *
 * <h3>Overview</h3>
 * <p>jEDI_Server parses out incoming EDI files, placing the data into a MySQL 
 * Database Server. This is a two-step process in that the data is placed into 
 * the appropriate data tables, as well as into audit tables to maintain a 
 * history of EDI transmissions. By maintaining this audit trail, Integrity 
 * Solutions is protecting their clients from bad claims by their customers. 
 * The audit data allows the recieving company to search for EDI transmissions 
 * in the event of a claim by a customer that they sent in an order, for 
 * example, but have never recieved the purchase. The recieving company can then 
 * search their EDI audit tables for the order their customer claims to have 
 * transmitted. These audit records will allow claims to be settled in a quick 
 * manner and the appropriate actions taken to correct the situation.</p>
 *
 * <p>Integrity Solutions was originally attempting to incorporate this 
 * functionality into the jEDI Master application, but has since decided that 
 * this should be a separate, stand-alone application that should only be 
 * installed and run on a backoffice server system. In this way, there will be a 
 * single entry point for all EDI transmissions and protect the database from 
 * any kind of corruption or collisions when inserting the data into the tables, 
 * production and audit. Therefore, Integrity Solutions has created this new 
 * repository for the code for the server-side EDI parsing utility.</p>
 *
 * <h3>Contributing</h3>
 * <p>If anyone would like to contribute to this project, Integrity Solutions 
 * can always use:</p>
 *
 * <ul>
 *  <li>Programmers: Java/J2SE</li>
 *  <li>Technical Writers: JavaHelp functionality</li>
 *  <li>Translators: Any languages are welcome</li>
 *  <li>Design Engineers: To help us plan out the functionality of the system
 *  </li>
 *  <li>Graphic Artists: To create icons/PNG graphics for use throughout the 
 *      application.</li>
 *  <li>Testers: To help us find bugs and feature failures in the software.</li>
 * </ul>
 * 
 * <p>If you would like to contribute in any of these functions, please shoot us 
 * an email at aschneblin@is2300.com or scarrick@is2300.com. We look forward to 
 * working with you on this project!</p>
 * 
 * @version 0.1.1.1
 * @author Sean Carrick
 */
public class JEDI_Server {
    //<editor-fold desc=" "Global" Constant Declarations ">
    /**
     * <p>Application version numbers (Major, Minor, Revision and Build) will be
     * handled as follows during merging on the GitHub server:</p>
     * 
     * <ol>
     *  <li> If there is no conflict over modification of these "constants", 
     *       then the merge will go through as requested.</li>
     *  <li>If there is a conflict between these values during the merge, the
     *      highest number will be used for the merge.</li>
     * </ol>
     * 
     * <p>The only compilations that are counted for incrementing these values
     * are the compilation of the code itself. JavaDoc generations do not count
     * toward incrementing these values.</p>
     */
    /**
     * Major application version number. This is updated when the Minor version
     * number reaches 10. Instead of being 0.10.1.15, the Major version number
     * will update to 1, so that the version will be 1.0.1.15.
     */
    public static final int APP_MAJOR = 0;
    /**
     * Minor application version number. This number will always be from 0 to 9.
     * Once it hits 9, when it's time to increment, Major version number will be
     * incremented and the Minor version number will revert to 0.
     */
    public static final int APP_MINOR = 1;
    /**
     * Revision application version number. This number will always be from 0 to
     * 9. Once it hits 9, when it's time to increment, Minor version number will
     * be incremented and the Revision version number will revert to 0.
     */
    public static final int APP_REVISION = 1;
    /**
     * Build application version number. This number will be incremented by 1
     * each time the code is built/compiled. Each time this number hits a
     * multiple of 50, the Revision version number will be incremented. This 
     * number will only reset to 1 once the Major version number increments.
     */
    public static final int APP_BUILD = 15;
    //</editor-fold>

    /**
     * Main entry point into the jEDI Server application. This function accepts
     * commandline arguments at application invocation, though at this time,
     * December 29, 2017, there are no commandline parameters to be used. This
     * may change in the future, as this application expands its functionality.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ////////////////////////////////////////////////////////////////////////
        // DEBUGGING CODE: Remove all bracketed code prior to release build.  //
        ////////////////////////////////////////////////////////////////////////
        System.out.println("171229: " + Utilities.formatShortDate("171229"));  
        System.out.println("20151229: " + Utilities.formatShortDate("20151229"));
        System.out.println(Utilities.formatShortDate("May 12, 2015"));        
        ////////////////////////////////////////////////////////////////////////
    }
    
}
