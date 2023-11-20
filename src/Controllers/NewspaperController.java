package Controllers;

import DAO.NewspaperDAO;
import Model.Book;
import Model.Newspaper;
import Model.Publisher;
import Model.Reader;
public class NewspaperController implements LiteratureController{
    private Newspaper newspaper;
    private NewspaperDAO newspaperDAO;

    @Override
    public void addLiterature(Publisher publisher) {

        /////////////////
        newspaperDAO.addNewspaper(newspaper);
    }

    @Override
    public void deleteLiterature(int id) {
        newspaperDAO.deleteNewspaper(newspaper);
    }

    public void assignLiterature() {
        newspaperDAO.assign();
    }
}
