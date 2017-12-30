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
 *      <td>SQL Date</td>
 *      <td>Returns a <code>String</code> that contains a short date properly
 *          formatted for MySQL Database Server. (i.e., 171229)</td>
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
     * This function provides the capability of having a <code>String</code>
     * properly formatted as a short date, i.e., 12/29/17. This function
     * provides minor data validation once the <code>String</code> passed in is
     * parsed into three (3) separate <code>String</code>s, to make sure that
     * the parameter had been parsed correctly.
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
        
        // Return the formatted short date.
        return fmtDate;
    }
}
