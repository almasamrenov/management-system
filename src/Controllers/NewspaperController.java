package Controllers;

import DAO.NewspaperDAO;
import Model.Newspaper;

public class NewspaperController implements LiteratureController{
    private Newspaper newspaper;
    private NewspaperDAO newspaperDAO;


    public void returnAllListOfLiter(){
        newspaperDAO.returnAllList();
    }

    @Override
    public void createLiterature() {
        ////
        newspaperDAO.addNewspaper(newspaper);
    }

    @Override
    public void deleteLiterature() {
        newspaperDAO.deleteNewspaper(newspaper);
    }

    public void assignLiterature() {
        newspaperDAO.assign();
    }
}
