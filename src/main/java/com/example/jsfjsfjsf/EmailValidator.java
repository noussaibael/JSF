package com.example.jsfjsfjsf;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.FacesValidator;
import jakarta.faces.validator.Validator;
import jakarta.faces.validator.ValidatorException;

@FacesValidator("EmailValidator")
public class EmailValidator implements Validator {

    @Override
    public void validate(FacesContext facesContext,
                         UIComponent component, Object value)
            throws ValidatorException {
        String email = (String) value;

        // Vérifie si l'e-mail est unique
        if (!isEmailUnique(email)) {
            FacesMessage msg =
                    new FacesMessage("E-mail validation failed","This e-mail is already registered");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
        }

    }

    // Méthode pour vérifier l'unicité de l'e-mail
    private boolean isEmailUnique(String email) {
        // Implémentez la logique pour vérifier si l'e-mail est unique dans votre système
        return true; // Retourne true si l'e-mail est unique, sinon false
    }

}


