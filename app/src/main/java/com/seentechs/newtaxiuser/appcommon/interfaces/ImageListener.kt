package com.seentechs.newtaxiuser.appcommon.interfaces

/**
 * @package com.seentechs.newtaxiuser
 * @subpackage interfaces
 * @category ImageListener
 * @author Seen Technologies
 * 
 */

import okhttp3.RequestBody

/*****************************************************************
 * ImageListener
 */

interface ImageListener {
    fun onImageCompress(filePath: String, requestBody: RequestBody?)
}
