package com.seentechs.newtaxiuser.appcommon.dependencies.component

/**
 * @package com.seentechs.newtaxiuser
 * @subpackage dependencies.component
 * @category AppComponent
 * @author Seen Technologies
 *
 */


import com.seentechs.newtaxiuser.taxiapp.ScheduleRideDetailActivity
import com.seentechs.newtaxiuser.taxiapp.adapters.CarDetailsListAdapter

import com.seentechs.newtaxiuser.taxiapp.adapters.PastTripsPaginationAdapter
import com.seentechs.newtaxiuser.taxiapp.adapters.PriceRecycleAdapter
import com.seentechs.newtaxiuser.taxiapp.adapters.UpcomingAdapter
import com.seentechs.newtaxiuser.taxiapp.adapters.UpcomingTripsPaginationAdapter
import com.seentechs.newtaxiuser.appcommon.backgroundtask.ImageCompressAsyncTask
import com.seentechs.newtaxiuser.appcommon.configs.RunTimePermission
import com.seentechs.newtaxiuser.appcommon.configs.SessionManager
import com.seentechs.newtaxiuser.taxiapp.database.AddFirebaseDatabase
import com.seentechs.newtaxiuser.appcommon.dependencies.module.AppContainerModule
import com.seentechs.newtaxiuser.appcommon.dependencies.module.ApplicationModule
import com.seentechs.newtaxiuser.appcommon.dependencies.module.NetworkModule
import com.seentechs.newtaxiuser.appcommon.helper.CommonDialog
import com.seentechs.newtaxiuser.appcommon.drawpolyline.DownloadTask
import com.seentechs.newtaxiuser.appcommon.pushnotification.MyFirebaseInstanceIDService
import com.seentechs.newtaxiuser.appcommon.pushnotification.MyFirebaseMessagingService
import com.seentechs.newtaxiuser.taxiapp.sendrequest.CancelYourTripActivity
import com.seentechs.newtaxiuser.taxiapp.sendrequest.DriverNotAcceptActivity
import com.seentechs.newtaxiuser.taxiapp.sendrequest.DriverRatingActivity
import com.seentechs.newtaxiuser.taxiapp.sendrequest.PaymentAmountPage
import com.seentechs.newtaxiuser.taxiapp.sendrequest.SendingRequestActivity
import com.seentechs.newtaxiuser.taxiapp.sidebar.AddHome
import com.seentechs.newtaxiuser.taxiapp.sidebar.DriverContactActivity
import com.seentechs.newtaxiuser.taxiapp.sidebar.EnRoute
import com.seentechs.newtaxiuser.taxiapp.sidebar.FareBreakdown
import com.seentechs.newtaxiuser.taxiapp.sidebar.Profile
import com.seentechs.newtaxiuser.taxiapp.sidebar.Setting
import com.seentechs.newtaxiuser.taxiapp.sidebar.payment.*
import com.seentechs.newtaxiuser.taxiapp.sidebar.referral.ShowReferralOptions
import com.seentechs.newtaxiuser.taxiapp.sidebar.trips.Past
import com.seentechs.newtaxiuser.taxiapp.sidebar.trips.Receipt
import com.seentechs.newtaxiuser.taxiapp.sidebar.trips.TripDetails
import com.seentechs.newtaxiuser.taxiapp.sidebar.trips.Upcoming
import com.seentechs.newtaxiuser.taxiapp.sidebar.trips.YourTrips
import com.seentechs.newtaxiuser.appcommon.utils.CommonMethods
import com.seentechs.newtaxiuser.appcommon.utils.RequestCallback
import com.seentechs.newtaxiuser.appcommon.utils.userchoice.UserChoice
import com.seentechs.newtaxiuser.appcommon.views.*
import com.seentechs.newtaxiuser.taxiapp.views.addCardDetails.AddCardActivity
import com.seentechs.newtaxiuser.taxiapp.views.facebookAccountKit.FacebookAccountKitActivity
import com.seentechs.newtaxiuser.taxiapp.views.emergency.EmergencyContact
import com.seentechs.newtaxiuser.taxiapp.views.emergency.SosActivity
import com.seentechs.newtaxiuser.taxiapp.views.firebaseChat.ActivityChat
import com.seentechs.newtaxiuser.taxiapp.views.firebaseChat.AdapterFirebaseRecylcerview
import com.seentechs.newtaxiuser.taxiapp.views.firebaseChat.FirebaseChatHandler
import com.seentechs.newtaxiuser.taxiapp.views.main.MainActivity
import com.seentechs.newtaxiuser.taxiapp.views.main.filter.FeaturesInVehicleAdapter
import com.seentechs.newtaxiuser.taxiapp.views.peakPricing.PeakPricing
import com.seentechs.newtaxiuser.taxiapp.views.search.PlaceSearchActivity
import com.seentechs.newtaxiuser.taxiapp.views.signinsignup.*
import com.seentechs.newtaxiuser.taxiapp.views.splash.SplashActivity
import com.seentechs.newtaxiuser.taxiapp.views.voip.CallProcessingActivity
import com.seentechs.newtaxiuser.taxiapp.views.voip.NewTaxiSinchService

import javax.inject.Singleton

import dagger.Component


/*****************************************************************
 * App Component
 */
@Singleton
@Component(modules = [NetworkModule::class, ApplicationModule::class, AppContainerModule::class])
interface AppComponent {

    fun inject(splashActivity: SplashActivity)

    fun inject(mainActivity: MainActivity)

    fun inject(scheduleRideDetailActivity: ScheduleRideDetailActivity)

    fun inject(sendingRequestActivity: SendingRequestActivity)

    fun inject(driverNotAcceptActivity: DriverNotAcceptActivity)

    fun inject(mainActivity: PlaceSearchActivity)

    fun inject(signin_signup_activity: SigninSignupActivity)

    fun inject(ssResetPassword: SSResetPassword)

    fun inject(ssSocialDetailsActivity: SSRegisterActivity)

    fun inject(driverContactActivity: DriverContactActivity)

    fun inject(addHome: AddHome)

    fun inject(paymentPage: PaymentPage)

    fun inject(paymentAmountPage: PaymentAmountPage)

    fun inject(fareBreakdown: FareBreakdown)

    fun inject(addWalletActivity: AddWalletActivity)

    fun inject(promoAmountActivity: PromoAmountActivity)

    fun inject(yourTrips: YourTrips)

    fun inject(tripDetails: TripDetails)

    fun inject(enRoute: EnRoute)

    fun inject(sos_activity: SosActivity)

    fun inject(driverRatingActivity: DriverRatingActivity)

    fun inject(cancelYourTripActivity: CancelYourTripActivity)

    fun inject(commonDialog: CommonDialog)

    fun inject(setting: Setting)

    fun inject(profile: Profile)


    fun inject(emergencyContact: EmergencyContact)

    fun inject(activityChat: ActivityChat)

    fun inject(facebookAccountKitActivity: FacebookAccountKitActivity)

    fun inject(loginActivity: SSLoginActivity)

    fun inject(peakPricing: PeakPricing)

    fun inject(showReferralOptions: ShowReferralOptions)

    fun inject(callProcessingActivity: CallProcessingActivity)

    fun inject(NewTaxiSinchService: NewTaxiSinchService)

    // Fragments
    fun inject(past: Past)

    fun inject(upcoming: Upcoming)

    fun inject(receipt: Receipt)

    // Utilities
    fun inject(runTimePermission: RunTimePermission)

    fun inject(sessionManager: SessionManager)

    fun inject(commonMethods: CommonMethods)

    fun inject(requestCallback: RequestCallback)

    // Adapters

    fun inject(upcomingAdapter: UpcomingAdapter)


    fun inject(promoAmountAdapter: PromoAmountAdapter)

    fun inject(carDetailsListAdapter: CarDetailsListAdapter)

    fun inject(myFirebaseMessagingService: MyFirebaseMessagingService)

    fun inject(myFirebaseInstanceIDService: MyFirebaseInstanceIDService)

    fun inject(firebaseChatHandler: FirebaseChatHandler)

    fun inject(adapterFirebaseRecylcerview: AdapterFirebaseRecylcerview)


    // AsyncTask
    fun inject(imageCompressAsyncTask: ImageCompressAsyncTask)

    fun inject(downloadTask: DownloadTask)

    fun inject(firebaseDatabase: AddFirebaseDatabase)


    fun inject(priceRecycleAdapter: PriceRecycleAdapter)

    fun inject(pastTripsPaginationAdapter: PastTripsPaginationAdapter)

    fun inject(upcomingTripsPaginationAdapter: UpcomingTripsPaginationAdapter)
     fun inject(addCardActivity: AddCardActivity)
    fun inject(paymentMethodAdapter: PaymentMethodAdapter)
    fun inject(featuresInVehicleAdapter: FeaturesInVehicleAdapter)

    fun inject(supportActivityCommon: SupportActivityCommon)

    fun inject(supportAdapter: SupportAdapter)

    fun inject(bannerActivityCommon: BannerActivityCommon)

    fun inject(bannerAdapter: BannerAdapter)

    fun inject(paymentWebViewActivity: PaymentWebViewActivity)

    fun inject(commonActivity: CommonActivity)

    fun inject(userChoice: UserChoice)

}
