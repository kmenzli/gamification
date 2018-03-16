package org.exoplatform.addons.gamification.portlets.admin.rule;

import juzu.Path;
import juzu.Response;
import juzu.View;
import juzu.template.Template;
import org.exoplatform.addons.gamification.portlets.admin.badge.ManageBadgeController;
import org.exoplatform.addons.gamification.portlets.common.BaseController;
import org.exoplatform.gamification.service.BadgeService;
import org.exoplatform.services.log.ExoLogger;
import org.exoplatform.services.log.Log;

import javax.inject.Inject;
import javax.portlet.PortletPreferences;

public class ManageRuleController extends BaseController {
    protected static Log log = ExoLogger.getLogger(ManageRuleController.class);

    @Inject
    @Path("index.gtmpl")
    Template indexTemplate;

    @Inject
    PortletPreferences portletPreferences;

    @View
    public Response.Content index() {
        return indexTemplate.with().ok();
    }
}
