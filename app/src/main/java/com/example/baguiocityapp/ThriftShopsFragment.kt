package com.example.baguiocityapp

class ThriftShopsFragment : Fragment(R.layout.fragment_place_list) {

    private val viewModel: PlacesViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.placesRecyclerView)
        val adapter = PlacesAdapter()
        recyclerView.adapter = adapter

        viewModel.thriftShops.observe(viewLifecycleOwner) { places ->
            adapter.submitList(places)
        }
    }
}
