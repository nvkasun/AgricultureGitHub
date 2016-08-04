/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.analysis;

import java.util.Date;

/**
 *
 * @author gihan
 */
public abstract class AnalysisDecorator implements Analiser {

    @Override
    public abstract String analiseDetails(String type, int fieldID, Date startDate, Date endDate);
}
