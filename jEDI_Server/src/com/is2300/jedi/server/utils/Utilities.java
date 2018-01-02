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
package com.is2300.jedi.server.utils;

/**
 * <h3><code>Utilities</code> Class</h3>
 * 
 * <p>This class provides multiple utility functions for use throughout the
 * Integrity Solutions EDI Parsing Server. Each utility will have detailed
 * comments about what that utility does for the developer working on the EDI
 * Parsing Server application.</p>
 * 
 * <p>Furthermore, each utility should be added to the following list, to 
 * provide a brief description of what the utility does at the top of the 
 * <code>Utilities</code> Class' JavaDoc.</p>
 * 
 * <h3>Included Utilities</h3>
 * <table>
 *  <caption><code>Utility</code> Class Function Descriptions</caption>
 *  <tr>
 *      <th>Utility</th>
 *      <th>Brief Description</th>
 *  </tr>
 *  <tr>
 *      <td>Short Date</td>
 *      <td>Returns a <code>String</code> that contains a properly formatted
 *          short date. (i.e., 12/29/17)</td>
 *  </tr>
 *  <tr>
 *      <td>Medium Date</td>
 *      <td>Returns a <code>String</code> that contains a properly formatted
 *          medium date. (i.e., 12/29/2017)</td>
 *  </tr>
 *  <tr>
 *      <td>Long Date</td>
 *      <td> Returns a <code>String</code> that contains a properly formatted
 *          long date. (i.e., December 29, 2017)</td>
 *  </tr>
 *  <tr>
 *      <td>Complex Date</td>
 *      <td>Returns a <code>String</code> that contains a properly formatted
 *          complex date. (i.e., Friday, December 29, 2017)</td>
 *  </tr>
 *  <!-- Place any other functions/utilities added to the Utilities Class above,
 *       using proper HTML tagging to format the information in a consistent
 *       manner. -->
 * </table>
 * 
 * <p>We were going to have a function to format a date in such a way as to be
 * acceptable to the MySQL Database Server backend, but the EDI date formats are
 * already in the proper format for SQL. Therefore, that is why there is no such
 * utility function.</p>
 * 
 * <p>Each utility function will provide more detail including, but not limited
 * to, the required parameter(s) for the function, any details regarding how the
 * data is processed, etc. This detailed information will be included in each
 * functions JavaDoc comments, formatted as necessary to present the info in a
 * way that is understandable and useful to developers who may need to use such
 * function or utility.</p>
 *      
 * @author Sean Carrick
 */
public class Utilities {
    // Constants for use throughout the class.
    private static final String DATE_SEPARATOR = "/";
    private static final int MAX_MONTHS = 12;
    private static final int MAX_DAYS = 31;
    
    /**
     * <p>This function provides the capability of having a <code>String</code>
     * properly formatted as a short date, i.e., 12/29/17. This function
     * provides minor data validation once the <code>String</code> passed in is
     * parsed into three (3) separate <code>String</code>s, to make sure that
     * the parameter had been parsed correctly.</p>
     * 
     * <p>The typical EDI date, as transmitted, is either YYMMDD or YYYYMMDD.
     * Therefore, this function will need to determine the length of the date
     * supplied to it, then parse the date accordingly in order to properly
     * format it.</p>
     * 
     * @param date <code>String</code> of improperly formatted short date.
     * @return <code>String</code> of properly formatted short date.
     */
    public static String formatShortDate(String date) {
        // Create a variable in which to format the short date.
        String fmtDate = new String();
        
        // Create variables to hold the parsed date parameter values.
        String day = new String();
        String month = new String();
        String year = new String();
        
        // Figure out how long the provided date is.
        int length = date.length();
        
        // By default, it should only be six characters long, so we should be
        //+ able to operate on it in the if block.
        if ( length == 6 ) {
            // Since this is a standard EDI date, parsing it should be easy.
            // First, get the year, which should be the first two characters.
            year = date.substring(0, 2);
            
            // Next, get the month.
            month = date.substring(2, 4);
            
            // Lastly, get the day.
            day = date.substring(4, 6);
            
            // Build up our formatted date string.
            fmtDate = month + DATE_SEPARATOR + day + DATE_SEPARATOR + year;
        } else if ( length == 8 ) {
            // This is an unusual circumstance, but could possibly happen, so we
            //+ need to account for it.
            // First, get the year, but only the last two numbers.
            year = date.substring(2, 4);
            
            // Next, get the month.
            month = date.substring(4, 6);
            
            // Lastly, get the day.
            day = date.substring(6, 8);
            
            // Build up our formatted date string.
            fmtDate = month + DATE_SEPARATOR + day + DATE_SEPARATOR + year;
        } else {
            // This is a catch-all for dates that do not fall into either of the
            //+ above categories.
            // Print to the error stream that this is not a valid date.
            System.err.println(date + " is not valid for this function.");
        }
        
        // Return the formatted short date.
        return fmtDate;
    }

    /**
     * <p>This function provides the capability of have a <code>String</code>
     * properly formatted as a medium date, i.e., 12/31/2017 or Dec 31, 2017. 
     * This function provides minor data validation once the <code>String</code>
     * passed in is parsed into three (3) separate <code>String</code>s, to make 
     * sure that the parameter had been parsed correctly.</p>
     * 
     * <p>The typical EDI date, as transmitted, is either YYMMDD or YYYYMMDD.
     * Therefore, this function will need to determine the length of the date
     * supplied to it, then parse the date accordingly in order to properly
     * format it.</p>
     * 
     * @param date <code>String</code> of improperly formatted SQL date.
     * @param style <code>boolean</code> Either numerical (true) or alphabetical
     *                                   (false).
     * 
     * @return <code>String</code> of properly formatted SQL date.
     */
    public static String formatMediumDate(String date, boolean style) {
        // Create a variable to hold the formatted date to return.
        String fmtDate = new String();
        
        // Create the variables to hold the parsed out parts of the date.
        //+ Include an extra month variable to hold the alpha version of the
        //+ month.
        String month = new String();
        String aMonth = new String();
        String day = new String();
        String year = new String();
        
        // Create a variable to determine that the improperly formatted date is
        //+ of appropriate length to format into a medium date. I.e., eight (8)
        //+ characters in length.
        int length = date.length();
        
        // Return the formatted date.
        return fmtDate;
    }
}
