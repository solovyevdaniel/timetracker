package com.SYKIO.developer.apptracker.presenters;

import com.SYKIO.developer.apptracker.TimeConverter;
import com.SYKIO.developer.apptracker.models.ApplicationUsed;
import com.SYKIO.developer.apptracker.views.ApplicationsUsedView;

public class ApplicationsUsedPresenter extends BasePresenter<ApplicationUsed,
        ApplicationsUsedView> {

    @Override
    protected void updateView() {
        view().setTime(TimeConverter.convert(model.getSpentTime()));
        view().setApplicationName(model.getApplicationName());
    }

}
