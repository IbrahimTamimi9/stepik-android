package org.stepic.droid.di.downloads

import dagger.Subcomponent
import org.stepic.droid.receivers.DownloadCompleteReceiver
import org.stepic.droid.services.DeleteService
import org.stepic.droid.ui.fragments.DownloadsFragment

@DownloadsScope
@Subcomponent(modules = arrayOf(DownloadsModule::class))
interface DownloadsComponent {

    @Subcomponent.Builder
    interface Builder {
        fun build(): DownloadsComponent
    }

    fun inject(fragment: DownloadsFragment)

    fun inject(downloadCompleteReceiver: DownloadCompleteReceiver)

    fun inject(deleteService: DeleteService)
}
