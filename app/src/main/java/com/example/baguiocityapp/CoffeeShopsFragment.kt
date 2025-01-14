package com.example.baguiocityapp

// CoffeeShopsFragment.kt
class CoffeeShopsFragment : Fragment(R.layout.fragment_place_list) {

    private val viewModel: PlacesViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.placesRecyclerView)
        val adapter = PlacesAdapter()
        recyclerView.adapter = adapter

        viewModel.coffeeShops.observe(viewLifecycleOwner) { places ->
            adapter.submitList(places)
        }
    }
}
