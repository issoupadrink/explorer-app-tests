package com.explorer.models;

import org.graphwalker.core.model.Edge;
import org.graphwalker.core.model.Model;
import org.graphwalker.core.model.Vertex;

public class ExplorerModel {

    public ExplorerModel() {    }

    public Model generateModel() {
        Model model = new Model();

        Vertex v_Start = new Vertex().setName("v_Start");
        Vertex v_MainPage = new Vertex().setName("v_MainPage");
        Vertex v_Block = new Vertex().setName("v_Block");
        Vertex v_Epoch = new Vertex().setName("v_Epoch");

        Edge e_StartBrowser = new Edge()
                .setName("e_StartBrowser")
                .setSourceVertex(v_Start)
                .setTargetVertex(v_MainPage);
        Edge e_SearchForBlockFromMainPage = new Edge()
                .setName("e_SearchForBlockFromMainPage")
                .setSourceVertex(v_MainPage)
                .setTargetVertex(v_Block);
        Edge e_SearchForBlockFromBlocksPage = new Edge()
                .setName("e_SearchForBlockFromBlocksPage")
                .setSourceVertex(v_Block)
                .setTargetVertex(v_Block);
        Edge e_SearchForBlockFromEpochsPage = new Edge()
                .setName("e_SearchForBlockFromEpochsPage")
                .setSourceVertex(v_Epoch)
                .setTargetVertex(v_Block);
        Edge e_GoToMainPageFromBlocksPage = new Edge()
                .setName("e_GoToMainPageFromBlocksPage")
                .setSourceVertex(v_Block)
                .setTargetVertex(v_MainPage);
        Edge e_SearchForEpochFromMainPage = new Edge()
                .setName("e_SearchForEpochFromMainPage")
                .setSourceVertex(v_MainPage)
                .setTargetVertex(v_Epoch);
        Edge e_SearchForEpochFromEpochsPage = new Edge()
                .setName("e_SearchForEpochFromEpochsPage")
                .setSourceVertex(v_Epoch)
                .setTargetVertex(v_Epoch);
        Edge e_SearchForEpochFromBlocksPage = new Edge()
                .setName("e_SearchForEpochFromBlocksPage")
                .setSourceVertex(v_Block)
                .setTargetVertex(v_Epoch);
        Edge e_GoToMainPageFromEpochsPage = new Edge()
                .setName("e_GoToMainPageFromEpochsPage")
                .setSourceVertex(v_Epoch)
                .setTargetVertex(v_MainPage);

        model.addVertex(v_Start);
        model.addVertex(v_MainPage);
        model.addVertex(v_Epoch);
        model.addVertex(v_Block);

        model.addEdge(e_StartBrowser);

        model.addEdge(e_SearchForBlockFromMainPage);
        model.addEdge(e_SearchForBlockFromBlocksPage);
        model.addEdge(e_SearchForBlockFromEpochsPage);
        model.addEdge(e_GoToMainPageFromBlocksPage);

        model.addEdge(e_SearchForEpochFromMainPage);
        model.addEdge(e_SearchForEpochFromEpochsPage);
        model.addEdge(e_SearchForEpochFromBlocksPage);
        model.addEdge(e_GoToMainPageFromEpochsPage);

        return model;
    }
}
