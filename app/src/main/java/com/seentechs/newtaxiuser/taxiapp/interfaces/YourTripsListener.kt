package com.seentechs.newtaxiuser.taxiapp.interfaces

/**
 * @package com.seentechs.newtaxiusereatsdriver
 * @subpackage interfaces
 * @category YourTripsListener
 * @author Seen Technologies
 * 
 */

import android.content.res.Resources

import com.seentechs.newtaxiuser.taxiapp.sidebar.trips.YourTrips


/*****************************************************************
 * YourTripsListener
 */

interface YourTripsListener {

    val res: Resources

    val instance: YourTrips
}
