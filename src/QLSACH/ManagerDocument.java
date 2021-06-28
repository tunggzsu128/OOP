package src.QLSACH;

import java.util.ArrayList;
import java.util.List;

import javax.print.Doc;

public class ManagerDocument {
    List<Document> documents;

    public ManagerDocument() {
        this.documents = new ArrayList<>();
    }

    public void addDocument(Document document) {
        this.documents.add(document);
    }

    public boolean deleteDocument(String id) {
        Document doc = this.documents.stream().filter(document -> document.getId().equals(id)).findFirst().orElse(null);
        if (doc == null) {
            return false;
        }
        this.documents.remove(doc);
        return true;
    }

    public void showInfor() {
        this.documents.forEach(documents -> System.out.println(documents.toString()));
    }

    public void searchBook() {
        this.documents.stream().filter(doc -> doc instanceof Book).forEach(doc -> System.out.println(doc.toString()));
    }

    public void searchNewspaper() {
        this.documents.stream().filter(doc -> doc instanceof Newspaper)
                .forEach(doc -> System.out.println(doc.toString()));
    }

    public void searchJournal() {
        this.documents.stream().filter(doc -> doc instanceof Journal)
                .forEach(doc -> System.out.println(doc.toString()));
    }
}
