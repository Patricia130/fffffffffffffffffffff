package com.seentechs.newtaxiuser.appcommon.interfaces

/**
 * @package com.seentechs.newtaxiuser
 * @subpackage interfaces
 * @category ServiceListener
 * @author Seen Technologies
 * 
 */

import com.seentechs.newtaxiuser.appcommon.datamodels.JsonResponse

/*****************************************************************
 * ServiceListener
 */
interface ServiceListener {

    fun onSuccess(jsonResp: JsonResponse, data: String)

    fun onFailure(jsonResp: JsonResponse, data: String)
}
