/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security;

import java.io.IOException;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

/**
 *
 * @author EEM
 */
public class CustomAuthenticationHandler extends SimpleUrlAuthenticationSuccessHandler {
 
 @Override
 public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws ServletException, IOException {
      String chefmagTargetUrl = "/chefmagPage/listepiecem.xhtml";
      String adminTargetUrl = "/adminPage/tabord.xhtml";
      String chefgarageTargetUrl = "/garagePage/listevehiculegarage.xhtml";
      String magasinTargetUrl = "/magPage/listedemcarb.xhtml";
      Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
      if (roles.contains("ROLE_ADMIN")) {
         getRedirectStrategy().sendRedirect(request, response, adminTargetUrl);
      } else if (roles.contains("ROLE_CMAGAS")) {
         getRedirectStrategy().sendRedirect(request, response, chefmagTargetUrl);
      } else if (roles.contains("ROLE_GARAG")) {
         getRedirectStrategy().sendRedirect(request, response, chefgarageTargetUrl);
      }else if (roles.contains("ROLE_MAGAS")) {
         getRedirectStrategy().sendRedirect(request, response, magasinTargetUrl);
      }
      else {
         super.onAuthenticationSuccess(request, response, authentication);
         return;
      }
   }
}
